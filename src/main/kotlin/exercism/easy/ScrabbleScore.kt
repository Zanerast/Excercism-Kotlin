package exercism.easy

// https://exercism.org/tracks/kotlin/exercises/scrabble-score
object ScrabbleScore {

    fun scoreWord(word: String): Int {
        return word.uppercase().sumOf {
            scoreLetter(it)
        }
    }

    private fun scoreLetter(c: Char): Int {
        return when (c.uppercaseChar()) {
            in "DG" -> 2
            in "BCMP" -> 3
            in "FHVWY" -> 4
            'K' -> 5
            in "JX" -> 8
            in "QZ" -> 10
            else -> 1
        }
    }
}
