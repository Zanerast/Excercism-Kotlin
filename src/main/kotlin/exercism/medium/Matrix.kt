package exercism.medium

class Matrix(private val matrixAsString: String) {

    private val rows = matrixAsString.lines()
        .map { it.trim()
            .split(" ")
            .filter(String::isNotBlank)
            .map(String::toInt)
        }

    fun column(colNr: Int): List<Int> = rows.map { it[colNr.minus(1)] }

    fun row(rowNr: Int): List<Int> = rows[rowNr.minus(1)]
}
