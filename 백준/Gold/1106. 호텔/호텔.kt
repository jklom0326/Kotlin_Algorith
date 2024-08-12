fun main() {
    val (c, n) = readln().split(" ").map { it.toInt() }
    val hotels = Array(n) { Hotel(0, 0) }
    repeat(n) {
        val (cost, ref) = readln().split(" ").map { it.toInt() }
        hotels[it] = Hotel(cost, ref)
    }

    val dp = Array(c + 100) { Int.MAX_VALUE }
    dp[0] = 0

    hotels.forEach {
        for (i in it.ref until c + 100) {
            if (dp[i - it.ref] != Int.MAX_VALUE) {
                dp[i] = minOf(dp[i], it.cost + dp[i - it.ref])
            }
        }
    }
    var result = Int.MAX_VALUE
    for (i in c until c + 100) {
        result = minOf(result, dp[i])
    }

    println(result)
}

data class Hotel(
    val cost: Int,
    val ref: Int,
)
