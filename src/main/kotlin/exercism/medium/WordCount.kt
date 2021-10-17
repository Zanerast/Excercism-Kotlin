package exercism.medium

import java.util.*

object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        val regexRemove = Regex("\n|\\s'|'\\s|'$")
        val regexSplit = Regex("[^a-zA-Z0-9']+")

        val wordList = phrase.toLowerCase()
            .replace(regexRemove, " ")
            .split(regexSplit)
            .filter { it.isNotEmpty() }

        return wordList.associateWith {
            Collections.frequency(wordList, it)
        }
    }
}
