fun main() {
    val n = readln().split("-").map { it.split("+") }
    var result = n[0].sumOf { it.toInt() }
    for (i in 1 until n.size) {
        result -= n[i].sumOf { it.toInt() }
    }
    println(result)
}