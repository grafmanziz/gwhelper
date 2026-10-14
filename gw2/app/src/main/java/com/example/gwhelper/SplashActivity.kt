package com.example.gwhelper

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.webkit.WebView

/** Заставка при запуске: анимированная надпись MANMASTER'S corporation, потом главный экран. */
class SplashActivity : Activity() {
    private var done = false

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val w = WebView(this)
        w.settings.javaScriptEnabled = true
        w.setBackgroundColor(Color.BLACK)
        w.loadUrl("file:///android_asset/splash.html")
        w.setOnClickListener { next() }
        setContentView(w)
        Handler(Looper.getMainLooper()).postDelayed({ next() }, 3800)
    }

    private fun next() {
        if (done) return
        done = true
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
}
