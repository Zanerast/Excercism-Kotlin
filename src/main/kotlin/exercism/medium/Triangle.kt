package exercism.medium

// https://exercism.org/tracks/kotlin/exercises/triangle
class Triangle<out T : Number>(a: T, b: T, c: T) {

    init {
        val sides = listOf(a, b, c).map { it.toDouble() }
        require(sides.all { it < sides.sum().minus(it) }){"Not a triangle"}
    }

    val isEquilateral: Boolean = a == b && a == c
    val isIsosceles: Boolean = a == b || a == c || b == c
    val isScalene: Boolean = !isIsosceles
}
