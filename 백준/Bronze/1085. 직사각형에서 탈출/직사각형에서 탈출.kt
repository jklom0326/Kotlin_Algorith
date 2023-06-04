fun main() {
    val square = readln().split(" ").map { it.toInt() }
    
    println(minOf(square[0], square[2] - square[0], square[1], square[3] - square[1]))
}