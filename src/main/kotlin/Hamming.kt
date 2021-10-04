// https://exercism.org/tracks/kotlin/exercises/hamming
object Hamming{
    fun compute(dnaOne: String, dnaTwo: String): Int{

        // Throws Illegal Argument exception
        require(dnaOne.length != dnaTwo.length)

        // Zip compares two lists of the same size
        return dnaOne.zip(dnaTwo).count { it.first == it.second }
    }
}