fun main() {
    val n = readln().split(" ").map { it.toInt() }
    println(n[0] * (n[1] - 1) + 1)
}