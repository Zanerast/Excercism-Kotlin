class Anagram(var anagram: String){

    fun match(list: List<String>): Set<String>{
        return list.filter {
            it.lowercase() != anagram.lowercase() && it.order() == anagram.order()
        }.toSet()
    }

    private fun String.order(): List<Char>{
        return this.map { it.lowercaseChar() }.sorted()
    }

}