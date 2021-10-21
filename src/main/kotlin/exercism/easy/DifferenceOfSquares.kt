package exercism.easy

import kotlin.math.pow

private fun Int.square() = this * this

class Squares(private val square: Int) {

    fun sumOfSquares() = (1..square).sumBy { it.square() }

    fun squareOfSum() = (1..square).sum().square()

    fun difference() = squareOfSum() - sumOfSquares()
}
