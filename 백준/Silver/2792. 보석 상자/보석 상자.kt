fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val gems = IntArray(m)
    var result = 0

    repeat(m) {
        gems[it] = readln().toInt()
    }
    gems.sort()

    var r = gems[m - 1]
    var l = 1

    while (r >= l) {
        val mid = (l + r) / 2
        var count = 0

        repeat(m) {
            count += if (gems[it] % mid == 0) gems[it] / mid
            else gems[it] / mid + 1
        }
        if (n >= count) {
            result = mid
            r = mid - 1
        } else {
            l = mid + 1
        }
    }
    println(result)
}