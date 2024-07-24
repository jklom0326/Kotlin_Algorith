import kotlin.math.max
import kotlin.math.sqrt

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { IntArray(m) }
    repeat(n) { n ->
        val line = readln()
        for ((idx, i) in line.withIndex()) {
            map[n][idx] = i.digitToInt()
        }
    }

    var result = -1

    for (i in 0 until n) {
        for (j in 0 until m) {
            for (di in -n until n) {
                for (dj in -m until m) {
                    if (di == 0 && dj == 0) continue
                    var ni = i
                    var nj = j
                    var now = 0
                    while (ni in 0 until n && nj in 0 until m) {
                        now *= 10
                        now += map[ni][nj]
                        val sqrt = sqrt(now.toDouble()).toInt()
                        if (sqrt * sqrt == now) result = max(result, now)
                        ni += di
                        nj += dj
                    }
                }
            }
        }
    }
    println(result)
}
