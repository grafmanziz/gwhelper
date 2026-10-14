package com.example.gwhelper

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val col = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(40, 60, 40, 40)
        }
        col.addView(TextView(this).apply {
            textSize = 16f
            text = "MANMASTER'S corporation\nGW помощник, ВЕРСИЯ 2 (заставка, мишени, dy/dx)\n\n" +
                "1) Включи службу «GW помощник» в настройках специальных возможностей " +
                "(если переключатель серый: Настройки, Приложения, GW помощник, три точки, Разрешить ограниченные настройки).\n\n" +
                "2) Открой игру. Появится кружок ≡. Нажми его: развернётся панель. Кнопки по краям экрана, середина свободна для выбора.\n\n" +
                "3) «📷 Анализ» (снимок игры: поле, бойцы, боты, мишени, препятствия) → «🟢 Я» и тап по своему бойцу → " +
                "«🔴 Цель» и тап по врагу или мишени → модель справа → «⌨ В игру».\n\n" +
                "4) Кнопка «dy/dx» переключает на режим дифференциальных уравнений (уровни, где вводится dy/dx).\n\n" +
                "5) «➖» сворачивает панель в кружок, «✕» закрывает. Вернуть: кнопка ниже.\n\n" +
                "Во время ввода формулы кружок показывает ■: нажми его, чтобы остановить."
        })
        col.addView(Button(this).apply {
            text = "Открыть настройки специальных возможностей"
            setOnClickListener { startActivity(Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)) }
        })
        col.addView(Button(this).apply {
            text = "Показать кружок (если закрыт)"
            setOnClickListener {
                val s = GwService.instance
                if (s == null) Toast.makeText(this@MainActivity, "Служба не включена", Toast.LENGTH_SHORT).show()
                else s.showBubble()
            }
        })
        setContentView(ScrollView(this).apply { addView(col) })
    }
}
