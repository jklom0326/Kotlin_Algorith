fun main() {
    val n = readln().toInt()
    val tile = IntArray(1000)
    tile[0] = 1
    tile[1] = 3
    for (i in 2 until  1000) {
        tile[i] = (tile[i - 1] + 2 * tile[i - 2]) % 10007
    }

    println(tile[n - 1])
}