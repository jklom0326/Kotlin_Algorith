fun main() {
    val (h, w) = readln().split(" ").map { it.toInt() }
    val block = readln().split(" ").map { it.toInt() }
    var result = 0
    for (i in 1 until w) {
        var left = 0
        var right = 0

        for (j in 0 until i) {
            left = maxOf(block[j], left)
        }

        for (j in i + 1 until w) {
            right = maxOf(block[j], right)
        }
        if (block[i] < left && block[i] < right) {
            result += minOf(left, right) - block[i]
        }
    }
    println(result)
}