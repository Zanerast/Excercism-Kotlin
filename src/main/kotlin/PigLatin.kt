// https://exercism.org/tracks/kotlin/exercises/pig-latin
object PigLatin{

    private val vowels = Regex("[aeiou]")
    private val ruleOne = Regex("([aeiou]|xr|yt)[a-z]*")
    private val ruleTwo = Regex("[b-df-hj-np-tv-z](\\w+)")
    private val ruleTwoVowels = Regex("[aeiouy]")
    private val ruleThree = Regex("[b-df-hj-np-tv-z]*qu(\\w+)")
    private val ruleFour = Regex("[b-df-hj-np-tv-z]+y(\\w*)")

    fun translate(word: String): String {
        val words = word.split(" ").map {
            translateSingleWord(it).plus(" ")
        }

        return words.joinToString("").trim()
    }

    private fun translateSingleWord(word: String): String {
        return when {
            // If a word begins with a vowel sound
            ruleOne.matches(word) && !ruleFour.matches(word) -> {
                word.plus("ay")
            }
            // If a word begins with a consonant sound
            ruleTwo.matches(word) && !ruleThree.matches(word) -> {
                val firstVowelLocation =
                    if (word[0] == 'y') vowels.find(word)?.range?.start ?: 0 else ruleTwoVowels.find(word)?.range?.start
                        ?: 0
                word.substring(firstVowelLocation, word.length).plus(word.substring(0, firstVowelLocation)).plus("ay")
            }
            // If a word starts with a consonant sound followed by "qu"
            ruleThree.matches(word) -> {
                val indexOfQu = word.indexOf("qu") + 2
                word.substring(indexOfQu, word.length).plus(word.substring(0, indexOfQu)).plus("ay")
            }
            // If a word contains a "y" after a consonant cluster or as the second letter in a two letter word
            ruleFour.matches(word) -> {
                val indexOfY = word.indexOf("y")
                word.substring(indexOfY, word.length).plus(word.substring(0, indexOfY)).plus("ay")
            }

            else -> word
        }
    }
}