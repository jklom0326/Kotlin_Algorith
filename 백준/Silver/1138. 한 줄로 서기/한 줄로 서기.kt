fun main() {
    val n = readln().toInt()
    val height = readln().split(" ").map { it.toInt() }.toIntArray()
    val ans = arrayListOf<Int>()

    for (i in n - 1 downTo 0) {
        ans.add(height[i], i + 1)
    }

    println(ans.joinToString(" "))
}