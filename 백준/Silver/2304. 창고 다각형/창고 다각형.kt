fun main() {
    val n = readln().toInt()
    val low = arrayListOf<Col>()
    var sum = 0
    var max = 0

    repeat(n) {
        val (l, c) = readln().split(" ").map { it.toInt() }
        low.add(Col(l, c))
    }

    low.sortBy { it.low }

    var highCol = low[0]
    for (i in 1 until low.size) {
        val col = low[i]

        if (col.height >= highCol.height) {
            sum += (col.low - highCol.low) * highCol.height
            highCol = col
            max = i
        }
    }
    highCol = low[low.size - 1]
    for (i in 1 until low.size - max) {
        val col = low[low.size - 1 - i]

        if (col.height >= highCol.height) {
            sum += (highCol.low - col.low) * highCol.height
            highCol = col
        }
    }
    sum += low[max].height
    println(sum)
}

private data class Col(val low: Int, val height: Int)