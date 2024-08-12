fun main() {
    val n = readln().toInt()
    val dp = IntArray(n + 1) { 146858 }
    val sixAngleNumber = IntArray(n + 1) { 0 }

    sixAngleNum(sixAngleNumber, n)
    dp[0] = 0
    dp[1] = 1

    for (i in 2..n) {
        for (j in 1..i) {
            if (sixAngleNumber[j] > i) break
            if (dp[i] > dp[i - sixAngleNumber[j]] + 1) {
                dp[i] = dp[i - sixAngleNumber[j]] + 1
            }
        }
    }
    println(dp[n])
}

private fun sixAngleNum(
    sixAngleNumber: IntArray,
    n: Int,
) {
    sixAngleNumber[1] = 1
    for (i in 2..n) {
        sixAngleNumber[i] = (i - 1) * 6 + sixAngleNumber[i - 1] - (2 * (i - 1) - 1)
    }
}
