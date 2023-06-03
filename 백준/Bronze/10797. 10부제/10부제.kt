fun main() {
    val n = readln().toInt()
    val line = readln().split(" ").map { it.toInt() }

    println(line.count() { it == n })
}