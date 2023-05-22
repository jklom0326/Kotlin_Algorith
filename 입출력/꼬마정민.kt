package 입출력

fun main() {
    val n = readLine()!!.split(" ").map { it.toLong() }
    println(n.sum())
}