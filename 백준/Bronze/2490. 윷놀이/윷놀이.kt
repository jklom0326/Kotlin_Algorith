fun main() {
    repeat(3) {
        val n = readln().split(" ").map { it.toInt() }
        when (n.count() { it == 0 }) {
            0 -> println("E")
            1 -> println("A")
            2 -> println("B")
            3 -> println("C")
            4 -> println("D")
        }
    }
}