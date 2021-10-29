data class MatrixCoordinate(val row: Int, val col: Int)

class SaddlePointsMatrix(rows: List<List<Int>>) {
    private val columnMins = (0 until rows[0].size).map { columnIndex -> rows.map { it[columnIndex] }.minOrNull() }
    val saddlePoints: Set<MatrixCoordinate> =
        rows.mapIndexed { rowIndex, row ->
            row.mapIndexedNotNull { columnIndex, rowValue ->
                if (rowValue == row.maxOrNull() && rowValue == columnMins[columnIndex]){
                    MatrixCoordinate(rowIndex.plus(1), columnIndex.plus(1))
                } else null
            }
        }.flatten().toSet()
}

