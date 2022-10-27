package 온보딩

fun solution3(number: Int): Int = (1..number).joinToString("") { it.toString() }.filter { it == '3' || it == '6' || it == '9'}.length

fun main() {
    println(solution3(13))
    println(solution3(44))
    println(solution3(10000))
}