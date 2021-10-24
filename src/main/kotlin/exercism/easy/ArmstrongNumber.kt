package exercism.easy

import kotlin.math.pow

// https://exercism.org/tracks/kotlin/exercises/armstrong-numbers
object ArmstrongNumber {

    private fun Char.armstrong(length: Int) = (this - '0').toDouble().pow(length.toDouble()).toInt()

    fun check(input: Int): Boolean = input == input.toString().map {
        it.armstrong(input.toString().length)
    }.sum()

}
