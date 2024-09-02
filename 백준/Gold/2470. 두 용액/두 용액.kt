import kotlin.math.abs

fun main() {
    val n = readln().toInt()
    val solution = readln().split(" ").map { it.toInt() }.sorted()
    var start = 0
    var end = n - 1
    var min = Int.MAX_VALUE
    val result = IntArray(2)
    while (start < end) {
        val sum = solution[start] + solution[end]

        if (min > abs(sum)) {
            min = abs(sum)

            result[0] = solution[start]
            result[1] = solution[end]

            if (sum == 0) break
        }

        if (sum < 0) {
            start++
        } else {
            end--
        }
    }

    println("${result[0]} ${result[1]}")
}
