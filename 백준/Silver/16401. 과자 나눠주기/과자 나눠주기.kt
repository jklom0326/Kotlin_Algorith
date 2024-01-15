fun main() {
    val (m, n) = readln().split(" ").map { it.toInt() }
    val child = readln().split(" ").map { it.toInt() }.toIntArray()

    child.sort()

    var left = 1L
    var right = child[n - 1].toLong()
    var result = 0L

    while (right >= left) {
        var count = 0L
        val mid = (right + left) / 2
        // 과자 길이 최대값 찾고
        for (i in 0 until n) count += child[i] / mid
        if (count >= m) {
            // 긴과자를 찾음
            if (mid > result) result = mid
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    println(result)
}