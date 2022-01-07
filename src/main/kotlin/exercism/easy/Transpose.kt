package exercism.easy

object Transpose {

    fun transpose(input: List<String>): List<String> {
        val list = mutableMapOf<Int, String>()
        input.forEachIndexed { firstIndex, it ->
            it.forEachIndexed { index, c ->
                if (index == getSize(input)) list[index] = list.getOrDefault(index, " ".repeat(firstIndex)).plus(c)
                else {
                    val result = list.getOrDefault(index, "")
                    if (result.length != firstIndex)
                        list[index] = result.plus(" ".repeat(firstIndex - result.length)).plus(c)
                    else list[index] = result.plus(c)
                }
            }
        }

        return ArrayList(list.values)
    }

    private fun getSize(input: List<String>) = input.maxByOrNull { it.length }?.length?.minus(1) ?: 0
}
