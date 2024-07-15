fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val bags = Array(n + 1) { IntArray(2) }
    val dp = Array(n + 1) { IntArray(k + 1) }
    repeat(n) { i ->
        val (w, v) = readln().split(" ").map { it.toInt() }
        bags[i + 1] = intArrayOf(w, v)
    }

    for (j in 1..k) { // 무게
        for (i in 1..n) { // item
            dp[i][j] = dp[i - 1][j]
            if (j - bags[i][0] >= 0) {
                dp[i][j] = maxOf(dp[i - 1][j], bags[i][1] + dp[i - 1][j - bags[i][0]])
            }
        }
    }

    println(dp[n][k])
}