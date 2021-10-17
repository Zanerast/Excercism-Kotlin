package exercism.medium

class DiamondPrinter {

    fun printToList(letter: Char): List<String> {

        require(letter.toString() in "A".."Z")

        // Create list that will be transformed
        // eg C will create A,B,C,B,A
        val list: MutableList<Char> = mutableListOf()
        list.also {
            it.addAll('A'..letter)
            it.addAll((letter downTo 'A').drop(1))
        }

        return list.map {
            val left = " ".repeat(letter - it).plus(it).plus(" ".repeat(it - 'A'))
            left.plus(left.reversed().drop(1))
        }
    }
}