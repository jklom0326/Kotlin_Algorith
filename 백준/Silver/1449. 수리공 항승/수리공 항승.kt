fun main() {
    val (n, l) = readln().split(" ").map { it.toInt() }
    val pipe = readln().split(" ").map { it.toInt() }.sorted()

    var result = 0
    var temp = 0

    for (i in 0 until n) {
        if (pipe[i] > temp) {
            result++
            temp = pipe[i]
            temp += l - 1
        }
    }

    println(result)
}
