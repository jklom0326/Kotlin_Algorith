package 다이나믹

fun main() {
    val n = readLine()!!.toInt()

    println(tiling(n))
}

fun tiling(n: Int): Int {
    val tile = mutableListOf(1, 2)
    for (i in 2..n) {
        tile.add((tile[i - 2] + tile[i - 1]) % 10007)
    }
    return tile[n - 1]
}
