fun main() {
    val (n, m, l) = readln().split(" ").map { it.toInt() }
    val stations = mutableListOf<Int>()
    val line = readln()
    if (line.isNotEmpty()) {
        line.split(" ").forEach { stations.add(it.toInt()) }
    }
    stations.add(0)
    stations.add(l)
    stations.sort()
    var left = 1
    var right = l - 1

    while (left <= right) {
        val mid = (right + left) / 2
        var count = 0
        for (i in 1 until stations.size) {
            count += (stations[i] - stations[i - 1]) / mid
            if ((stations[i] - stations[i - 1]) % mid == 0) count--
        }
        if (count > m) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    println(left)
}
