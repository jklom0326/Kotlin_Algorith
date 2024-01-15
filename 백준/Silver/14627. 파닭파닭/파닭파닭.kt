fun main() {
    val (s, c) = readln().split(" ").map { it.toInt() }
    val chicken = IntArray(s)
    repeat(s) {
        chicken[it] = readln().toInt()
    }
    var left = 1L
    var right = 1000000000L
    var result = 0L
    var sum = 0L

    while (right >= left) {
        val mid = (left + right) / 2
        var count = 0L
        // 모든파 - (최대파 * 치킨)
        for (i in 0 until s) {
            count += chicken[i] / mid
        }
        if (count >= c) {
            result = mid
            left = mid + 1
        } else if (count < c) {
            right = mid - 1
        }
    }
    for (n in chicken) sum += n
    val answer = sum - (result * c)
    println(answer)
}