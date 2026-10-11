package com.example.gwhelper

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.GestureDescription
import android.app.Activity
import android.content.Intent
import android.graphics.Path
import android.graphics.PixelFormat
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.Settings
import android.view.Gravity
import android.view.MotionEvent
import android.view.WindowManager
import android.view.accessibility.AccessibilityEvent
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView

/** Координаты кнопок клавиатуры Graphwar II на экране 2340x1080 (Samsung S23 FE, горизонтально). */
object Keys {
    const val PRESS_MS = 25L
    const val GAP_MS = 45L
    /** true: кнопка abs/sin/... в игре сама ставит скобку. Проверь тестовой кнопкой abs. */
    const val FUNC_INSERTS_PAREN = true

    val pos: Map<String, Pair<Float, Float>> = mapOf(
        "C" to (140f to 236f), "pi" to (261f to 236f), "e" to (382f to 236f),
        "1" to (140f to 357f), "2" to (261f to 357f), "3" to (382f to 357f),
        "4" to (140f to 478f), "5" to (261f to 478f), "6" to (382f to 478f),
        "7" to (140f to 599f), "8" to (261f to 599f), "9" to (382f to 599f),
        "(" to (140f to 720f), "0" to (261f to 720f), "." to (382f to 720f),
        "home" to (140f to 841f), "left" to (261f to 841f), "bksp" to (382f to 841f),
        "abs" to (2003f to 236f), "ln" to (2136f to 236f), "sqrt" to (2271f to 236f),
        "sin" to (2003f to 357f), "cos" to (2136f to 357f), "tan" to (2271f to 357f),
        "*" to (2003f to 478f), "/" to (2136f to 478f), "exp" to (2271f to 478f),
        "+" to (2003f to 599f), "-" to (2136f to 599f), "^" to (2271f to 599f),
        "x" to (2003f to 720f), "y" to (2136f to 720f), ")" to (2271f to 720f),
        "clear" to (2003f to 841f), "right" to (2136f to 841f), "end" to (2271f to 841f),
        "undo" to (170f to 57f), "hide" to (352f to 57f), "fire" to (2138f to 57f)
    )

    private val words = listOf("sqrt", "abs", "sin", "cos", "tan", "exp", "ln", "pi")

    fun tokenize(s: String): List<String> {
        val out = ArrayList<String>()
        var i = 0
        while (i < s.length) {
            val w = words.firstOrNull { s.startsWith(it, i) }
            if (w != null) {
                out.add(w)
                i += w.length
                if (FUNC_INSERTS_PAREN && w != "pi" && i < s.length && s[i] == '(') i++
            } else {
                val c = s[i]
                if (c != ' ' && c != '\n') out.add(c.toString())
                i++
            }
        }
        return out
    }
}

class GwService : AccessibilityService() {
    private val ui = Handler(Looper.getMainLooper())
    private var panel: LinearLayout? = null
    private var status: TextView? = null
    private lateinit var wm: WindowManager
    private lateinit var lp: WindowManager.LayoutParams
    private var busy = false

    override fun onServiceConnected() {
        super.onServiceConnected()
        wm = getSystemService(WINDOW_SERVICE) as WindowManager
        showPanel()
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}
    override fun onInterrupt() {}

    override fun onDestroy() {
        panel?.let { try { wm.removeView(it) } catch (_: Exception) {} }
        panel = null
        super.onDestroy()
    }

    private fun button(text: String, onClick: () -> Unit) = Button(this).apply {
        this.text = text
        textSize = 13f
        isAllCaps = false
        minWidth = 0
        minHeight = 0
        setPadding(18, 6, 18, 6)
        setOnClickListener { onClick() }
    }

    private fun showPanel() {
        val p = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            setBackgroundColor(0xE6102A20.toInt())
            setPadding(8, 8, 8, 8)
        }
        val handle = TextView(this).apply {
            text = "≡ "
            textSize = 22f
            setTextColor(0xFFFFFFFF.toInt())
        }
        status = TextView(this).apply {
            text = "готов"
            textSize = 12f
            setTextColor(0xFFB6FFB6.toInt())
            setPadding(12, 0, 0, 0)
        }
        p.addView(handle)
        p.addView(button("1+2*x") { typeText("1+2*x") })
        p.addView(button("abs") { typeKeys(listOf("abs")) })
        p.addView(button("10 цифр") { typeText("1234567890") })
        p.addView(button("C") { typeKeys(listOf("C")) })
        p.addView(status)

        lp = WindowManager.LayoutParams(
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.WRAP_CONTENT,
            WindowManager.LayoutParams.TYPE_ACCESSIBILITY_OVERLAY,
            WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE or WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            PixelFormat.TRANSLUCENT
        ).apply {
            gravity = Gravity.TOP or Gravity.START
            x = 470
            y = 60
        }

        var sx = 0; var sy = 0; var tx = 0f; var ty = 0f
        handle.setOnTouchListener { _, e ->
            when (e.action) {
                MotionEvent.ACTION_DOWN -> { sx = lp.x; sy = lp.y; tx = e.rawX; ty = e.rawY }
                MotionEvent.ACTION_MOVE -> {
                    lp.x = sx + (e.rawX - tx).toInt()
                    lp.y = sy + (e.rawY - ty).toInt()
                    wm.updateViewLayout(p, lp)
                }
            }
            true
        }
        wm.addView(p, lp)
        panel = p
    }

    private fun setStatus(t: String) { status?.text = t }

    private fun typeText(s: String) = typeKeys(Keys.tokenize(s))

    private fun typeKeys(keys: List<String>) {
        if (busy) { setStatus("занято"); return }
        busy = true
        setStatus("ввод…")
        next(keys, 0)
    }

    private fun next(keys: List<String>, i: Int) {
        if (i >= keys.size) { busy = false; setStatus("готово: ${keys.size} нажатий"); return }
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
                busy = false
                setStatus("отменено на ${i + 1}-м нажатии")
            }
        }, null)
        if (!ok) { busy = false; setStatus("не удалось нажать") }
    }
}

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val col = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
        }
        col.addView(TextView(this).apply {
            textSize = 16f
            text = "GW помощник, шаг 1: тест нажатий.\n\n" +
                "1) Нажми кнопку ниже, найди GW помощник в списке служб и включи его " +
                "(если кнопка серая: Настройки, Приложения, GW помощник, три точки, Разрешить ограниченные настройки).\n\n" +
                "2) Открой игру. Поверх неё появится маленькая панель; её можно перетащить за значок ≡.\n\n" +
                "3) Нажми 1+2*x: в строке f(x) должно появиться 1+2*x.\n" +
                "4) Нажми C, затем abs и посмотри, что появилось: abs( или abs.\n" +
                "5) Нажми 10 цифр: должно появиться 1234567890 без пропусков.\n\n" +
                "Результат (что появилось в строке f(x)) пришли мне."
        })
        col.addView(Button(this).apply {
            text = "Открыть настройки специальных возможностей"
            setOnClickListener { startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)) }
        })
        setContentView(ScrollView(this).apply { addView(col) })
    }
}
