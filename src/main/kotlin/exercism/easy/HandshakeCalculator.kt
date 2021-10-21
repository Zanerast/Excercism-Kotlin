package exercism.easy

object HandshakeCalculator {

    fun calculateHandshake(number: Int): List<Signal> {
        return mutableListOf<Signal>().apply {
            Signal.values().forEach {
                if (it.bitCode and number > 0) {
                    if (it == Signal.REVERSE) reverse() else add(it)
                }
            }
        }
    }
}

enum class Signal(val bitCode: Int) {
    WINK(1), DOUBLE_BLINK(2), CLOSE_YOUR_EYES(4), JUMP(8), REVERSE(16)
}