fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val dp = Array(a + 1) { IntArray(a + 1) }

    for (i in dp.indices) {
        for (j in 0..i) {
            if (i == j || j == 0) {
                dp[i][j] = 1;
            } else {
                dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j]) % 10007
            }
        }
    }
    println(dp[a][b])
}