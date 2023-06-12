fun main() {
    val n = readln().toInt()

    val array = Array(n) { IntArray(3) }


    repeat(n) { rgbNum ->
        val rgb = readln().split(" ").map { it.toInt() }
        array[rgbNum][0] = rgb[0]
        array[rgbNum][1] = rgb[1]
        array[rgbNum][2] = rgb[2]
    }

    for (i in 1 until n) {
        array[i][0] += minOf(array[i - 1][1], array[i - 1][2])
        array[i][1] += minOf(array[i - 1][0], array[i - 1][2])
        array[i][2] += minOf(array[i - 1][0], array[i - 1][1])
    }
    println(minOf(array[n - 1][0], array[n - 1][1], array[n - 1][2]))
}