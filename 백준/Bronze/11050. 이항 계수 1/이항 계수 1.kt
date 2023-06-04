fun main() {
    val num = readln().split(" ").map { it.toInt() }

    println(recursion(num[0]) / (recursion(num[1]) * recursion(num[0] - num[1])))
}

fun recursion(n: Int): Int = if (n <= 1) 1 else (n * recursion(n - 1))