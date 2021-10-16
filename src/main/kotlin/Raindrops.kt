//https://exercism.org/tracks/kotlin/exercises/raindrops
object Raindrops {
    fun convert(input: Int): String {
        val numbersToNames = sortedMapOf(3 to "Pling", 5 to "Plang", 7 to "Plong")

        return numbersToNames.filterKeys { input % it == 0}.values.joinToString(separator = "").takeIf { it.isNotEmpty() } ?: input.toString()
    }
}