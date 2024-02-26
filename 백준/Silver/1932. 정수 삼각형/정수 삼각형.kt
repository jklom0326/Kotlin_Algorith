fun main() {
    val n = readln().toInt()
    val tri = Array(n + 1) { IntArray(n + 1) }
    val dp = Array(n + 1) { IntArray(n + 1) }

    for (i in 1..n) {
        val line = readln().split(" ").map { it.toInt() }
        for (j in 1..i) {
            tri[i][j] = line[j - 1]
        }
    }

    for (i in 1..n) {
        for (j in 1..n) {
            dp[i][j] = maxOf(dp[i - 1][j - 1], dp[i - 1][j]) + tri[i][j]
        }
    }

    var result = 0

    for (i in 1..n) {
        if (result < dp[n][i]) result = dp[n][i]
    }
    println(result)
}