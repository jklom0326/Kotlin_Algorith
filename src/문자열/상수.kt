package 문자열


fun main() {
    val n = readLine()!!.split(" ").map { it.reversed().toInt() }
    println(n.maxOrNull())
}