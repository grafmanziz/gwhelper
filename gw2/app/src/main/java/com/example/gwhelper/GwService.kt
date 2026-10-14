package com.example.gwhelper

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.GestureDescription
import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.Path
import android.graphics.PixelFormat
import android.graphics.drawable.GradientDrawable
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.util.Base64
import android.view.Display
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.WindowManager
import android.view.accessibility.AccessibilityEvent
import android.webkit.JavascriptInterface
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import android.widget.Toast
import java.io.ByteArrayOutputStream
import java.util.concurrent.Executors

/**
 * Служба: кружок «≡» поверх игры -> по нажатию разворачивается панель (страница из assets/index.html),
 * делает снимок экрана, считает формулу и нажимает кнопки клавиатуры игры.
 */
class GwService : AccessibilityService() {
    companion object {
        @Volatile
        var instance: GwService? = null
    }

    private val ui = Handler(Looper.getMainLooper())
    private val worker = Executors.newSingleThreadExecutor()
    private lateinit var wm: WindowManager

    private var bubble: TextView? = null
    private var bubbleShown = false
    private lateinit var bubbleLp: WindowManager.LayoutParams
    private var bx = 470
    private var by = 60

    private var web: WebView? = null
    private var webShown = false

    private var typing = false
    private var cancelTyping = false

    override fun onServiceConnected() {
        super.onServiceConnected()
        instance = this
        wm = getSystemService(WINDOW_SERVICE) as WindowManager
        showBubble()
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}

    override fun onDestroy() {
        instance = null
        hideBubble()
        hideWeb()
        web?.destroy()
        web = null
        worker.shutdown()
        super.onDestroy()
    }

    private fun toast(t: String) {
        Toast.makeText(this, t, Toast.LENGTH_SHORT).show()
    }

    // ───────────── кружок ─────────────

    fun showBubble() {
        if (bubbleShown) return
        val dp = resources.displayMetrics.density
        val size = (52 * dp).toInt()
        val b = TextView(this).apply {
            text = if (typing) "■" else "≡"
            textSize = 26f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            background = GradientDrawable().apply {
                shape = GradientDrawable.OVAL
                setColor(0xE61B5E3A.toInt())
                setStroke((2 * dp).toInt(), Color.WHITE)
            }
        }
        bubbleLp = WindowManager.LayoutParams(
            size, size,
            WindowManager.LayoutParams.TYPE_ACCESSIBILITY_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            PixelFormat.TRANSLUCENT
        ).apply {
            gravity = Gravity.TOP or Gravity.START
            x = bx
            y = by
        }
        var sx = 0
        var sy = 0
        var tx = 0f
        var ty = 0f
        var moved = false
        b.setOnTouchListener { _, e ->
            when (e.action) {
                MotionEvent.ACTION_DOWN -> {
                    sx = bubbleLp.x; sy = bubbleLp.y; tx = e.rawX; ty = e.rawY; moved = false
                }
                MotionEvent.ACTION_MOVE -> {
                    val dx = e.rawX - tx
                    val dy = e.rawY - ty
                    if (Math.abs(dx) > 12 || Math.abs(dy) > 12) moved = true
                    if (moved) {
                        bubbleLp.x = sx + dx.toInt()
                        bubbleLp.y = sy + dy.toInt()
                        bx = bubbleLp.x; by = bubbleLp.y
                        wm.updateViewLayout(b, bubbleLp)
                    }
                }
                MotionEvent.ACTION_UP -> {
                    if (!moved) {
                        if (typing) cancelTyping = true else expand()
                    }
                }
            }
            true
        }
        wm.addView(b, bubbleLp)
        bubble = b
        bubbleShown = true
    }

    private fun hideBubble() {
        if (bubbleShown) {
            bubble?.let { try { wm.removeView(it) } catch (_: Exception) {} }
            bubbleShown = false
        }
    }

    // ───────────── панель (WebView) ─────────────

    fun expand() {
        hideBubble()
        showWeb()
    }

    fun collapse() {
        hideWeb()
        showBubble()
    }

    fun closeAll() {
        hideWeb()
        hideBubble()
    }

    @SuppressLint("SetJavaScriptEnabled")
    private fun createWeb(): WebView {
        val w = WebView(this)
        w.settings.javaScriptEnabled = true
        w.settings.domStorageEnabled = true
        w.settings.allowFileAccess = true
        w.setBackgroundColor(Color.BLACK)
        w.webViewClient = WebViewClient()
        w.addJavascriptInterface(Bridge(), "GW")
        w.loadUrl("file:///android_asset/index.html")
        return w
    }

    private fun showWeb() {
        if (webShown) return
        val w = web ?: createWeb().also { web = it }
        val lp = WindowManager.LayoutParams(
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.MATCH_PARENT,
            WindowManager.LayoutParams.TYPE_ACCESSIBILITY_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN or
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS or
                WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,
            PixelFormat.TRANSLUCENT
        )
        lp.gravity = Gravity.TOP or Gravity.START
        w.visibility = View.VISIBLE
        wm.addView(w, lp)
        webShown = true
    }

    private fun hideWeb() {
        if (webShown) {
            web?.let { try { wm.removeView(it) } catch (_: Exception) {} }
            webShown = false
        }
    }

    /** Методы, которые страница вызывает как GW.shot(), GW.type(...), GW.collapse(), GW.close(). */
    inner class Bridge {
        @JavascriptInterface
        fun shot() { ui.post { analyze() } }

        @JavascriptInterface
        fun type(text: String) { ui.post { startTyping(text) } }

        @JavascriptInterface
        fun collapse() { ui.post { this@GwService.collapse() } }

        @JavascriptInterface
        fun close() { ui.post { closeAll() } }
    }

    // ───────────── снимок экрана ─────────────

    private fun analyze() {
        if (Build.VERSION.SDK_INT < 30) {
            toast("Снимок экрана работает на Android 11 и новее")
            return
        }
        val w = web ?: return
        w.visibility = View.INVISIBLE            // убираем панель, чтобы она не попала в кадр
        ui.postDelayed({
            takeScreenshot(Display.DEFAULT_DISPLAY, worker, object : TakeScreenshotCallback {
                override fun onSuccess(screenshot: ScreenshotResult) {
                    try {
                        val hb = screenshot.hardwareBuffer
                        val hw = Bitmap.wrapHardwareBuffer(hb, screenshot.colorSpace)
                        val bmp = hw!!.copy(Bitmap.Config.ARGB_8888, false)
                        hb.close()
                        val bos = ByteArrayOutputStream()
                        bmp.compress(Bitmap.CompressFormat.JPEG, 95, bos)
                        val b64 = Base64.encodeToString(bos.toByteArray(), Base64.NO_WRAP)
                        ui.post {
                            w.visibility = View.VISIBLE
                            w.evaluateJavascript("GWApp.onShot('data:image/jpeg;base64,$b64')", null)
                        }
                    } catch (e: Exception) {
                        ui.post { w.visibility = View.VISIBLE; toast("Ошибка снимка: ${e.message}") }
                    }
                }

                override fun onFailure(errorCode: Int) {
                    ui.post { w.visibility = View.VISIBLE; toast("Снимок не получился (код $errorCode)") }
                }
            })
        }, 350)
    }

    // ───────────── ввод формулы нажатиями ─────────────

    private fun startTyping(text: String) {
        if (typing) { toast("Ввод уже идёт"); return }
        if (text.isBlank()) { toast("Нет формулы"); return }
        typing = true
        cancelTyping = false
        hideWeb()
        hideBubble()
        showBubble()
        bubble?.text = "■"
        toast("Ввод формулы… (кружок ■ — остановить)")
        val keys = listOf("C") + Keys.tokenize(text)
        ui.postDelayed({ next(keys, 0) }, 400)
    }

    private fun finishTyping(msg: String) {
        typing = false
        bubble?.text = "≡"
        toast(msg)
    }

    private fun next(keys: List<String>, i: Int) {
        if (cancelTyping) { finishTyping("Ввод остановлен"); return }
        if (i >= keys.size) { finishTyping("Формула введена: ${keys.size} нажатий"); return }
        val pos = Keys.pos[keys[i]]
        if (pos == null) { next(keys, i + 1); return }
        val path = Path().apply { moveTo(pos.first, pos.second) }
        val gesture = GestureDescription.Builder()
            .addStroke(GestureDescription.StrokeDescription(path, 0, Keys.PRESS_MS))
            .build()
        val ok = dispatchGesture(gesture, object : GestureResultCallback() {
            override fun onCompleted(g: GestureDescription?) {
                ui.postDelayed({ next(keys, i + 1) }, Keys.GAP_MS)
            }

            override fun onCancelled(g: GestureDescription?) {
                finishTyping("Нажатие отменено на ${i + 1}-м шаге")
            }
        }, null)
        if (!ok) finishTyping("Не удалось нажать")
    }
}
