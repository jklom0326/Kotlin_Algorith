fun main() {
    val s1 = readln()
    val s2 = readln()
    val dp = Array(s2.length + 1) { IntArray(s1.length + 1) }

    repeat(s2.length) { i ->
        val c = s2[i]
        repeat(s1.length) { j ->
            if (c == s1[j]) {
                dp[i + 1][j + 1] = dp[i][j] + 1
            } else {
                dp[i + 1][j + 1] = maxOf(dp[i + 1][j], dp[i][j + 1])
            }
        }
    }
    println(dp[s2.length][s1.length])
}