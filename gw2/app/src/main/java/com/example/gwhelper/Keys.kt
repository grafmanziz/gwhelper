package com.example.gwhelper

/** Координаты кнопок клавиатуры Graphwar II на экране 2340x1080 (Samsung S23 FE, горизонтально).
 *  Сняты по скриншоту: это центры кнопок в пикселях. */
object Keys {
    const val PRESS_MS = 25L   // сколько длится касание
    const val GAP_MS = 45L     // пауза между нажатиями
    /** true — кнопка «abs/sin/…» в игре сама ставит скобку «(». Проверь тестовой кнопкой «abs». */
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

    /** Разбивает формулу на нажатия: "abs(x-3)" -> abs, x, -, 3, ) */
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
