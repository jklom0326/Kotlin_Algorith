fun main() {
    val n = readln().toInt()
    val tile = mutableListOf<Int>()

    tile.add(1)
    tile.add(1)
    tile.add(2)
    for (i in 3..n) {
        tile.add((tile[i - 1] + tile[i - 2]) % 15746)
    }
    println(tile[n])
}