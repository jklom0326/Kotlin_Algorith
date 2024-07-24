fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val map = Array(n) { "" }
    val lightMap = IntArray(n)
    repeat(n) { n ->
        val line = readln()
        map[n] = line
    }
    map.sort()
    val k = readln().toInt()
    var result = 0
    var count = 0
    var prev = ""
    for (i in 0 until n) {
        for (j in 0 until m) {
            if (map[i][j] == '0') {
                lightMap[i]++
            }
        }
        if (map[i] != prev) count = 0
        prev = map[i]

        if (lightMap[i] <= k && lightMap[i] % 2 == k % 2) {
            count++
            result = maxOf(result, count)
        }
    }

    println(result)
}
