fun main() {
    val n = readln().toInt()
    val line = Array(n + 1) { IntArray(3) }
    val minDp = Array(n + 1) { DoubleArray(3) }
    val maxDp = Array(n + 1) { DoubleArray(3) }
    for (i in 1..n) {
        val input = readln().split(" ").map { it.toInt() }
        for (j in 0 until 3) {
            line[i][j] = input[j]
        }
    }

    for (i in 1..n) {
        maxDp[i][0] += maxOf(maxDp[i - 1][0], maxDp[i - 1][1]) + line[i][0]
        maxDp[i][1] += maxOf(maxOf(maxDp[i - 1][0], maxDp[i - 1][1]), maxDp[i - 1][2]) + line[i][1]
        maxDp[i][2] += maxOf(maxDp[i - 1][1], maxDp[i - 1][2]) + line[i][2]
    }

    for (i in 1..n) {
        minDp[i][0] += minOf(minDp[i - 1][0], minDp[i - 1][1]) + line[i][0]
        minDp[i][1] += minOf(minOf(minDp[i - 1][0], minDp[i - 1][1]), minDp[i - 1][2]) + line[i][1]
        minDp[i][2] += minOf(minDp[i - 1][1], minDp[i - 1][2]) + line[i][2]
    }

    var min = Int.MAX_VALUE
    var max = Int.MIN_VALUE
    for (i in 0..2) {
        min = minOf(min.toDouble(), minDp[n][i]).toInt()
        max = maxOf(max.toDouble(), maxDp[n][i]).toInt()
    }
    println("$max $min")
}
