fun main() {
    val n = readln().toInt()
    val A = readln().split(" ").map { it.toInt() }.sorted()
    val B = readln().split(" ").map { it.toInt() }.sortedDescending()

    var max = 0
    repeat(n) {
        max += A[it] * B[it]
    }
    println(max)
}