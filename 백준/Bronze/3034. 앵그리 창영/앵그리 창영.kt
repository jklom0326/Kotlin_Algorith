import kotlin.math.pow

fun main() {
    val n = readln().split(" ").map { it.toInt() }

    repeat(n[0]) {
        val input = readln().toDouble()
        if (n[1].toDouble().pow(2) + n[2].toDouble().pow(2) >= input.pow(2)) {
            println("DA")
        } else {
            println("NE")
        }
    }
}
