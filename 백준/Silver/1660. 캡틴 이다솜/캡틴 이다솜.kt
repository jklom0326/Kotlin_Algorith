fun main() {
    val n = readln().toInt()
    val dp1 = IntArray(128)
    val dp2 = IntArray(128)

    for (i in 1 until 128) {
        dp1[i] = dp1[i - 1] + i
        dp2[i] = dp1[i] + dp2[i - 1]
    }

    val ans = IntArray(n + 1) { Int.MAX_VALUE }
    ans[0] = 0
    ans[1] = 1

    for (i in 2..n) {
        for (j in 1 until 128) {
            if (dp2[j] > i) break
            ans[i] = minOf(ans[i], ans[i - dp2[j]] + 1)
        }
    }

    println(ans[n])
}