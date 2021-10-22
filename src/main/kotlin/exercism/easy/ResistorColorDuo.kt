package exercism.easy

enum class Color() {
    BLACK, BROWN, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET, GREY, WHITE
}

object ResistorColorDuo {
    fun value(vararg colors: Color) = "${colors[0].ordinal}${colors[1].ordinal}".toInt()
}



