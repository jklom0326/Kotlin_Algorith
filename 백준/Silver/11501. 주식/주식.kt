fun main() {
    val t = readln().toInt()

    repeat(t) {
        val n = readln().toInt()
        val listN = readln().split(" ").map { it.toLong() }
        var max = 0L
        var result = 0L

        for (i in (n - 1) downTo 0) {
            if (listN[i] > max) max = listN[i] else result += (max - listN[i])
        }
        println(result)
    }
}