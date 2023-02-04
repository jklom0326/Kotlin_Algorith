package 프로그래머스.lv1

fun hashad(x: Int): Boolean = x % x.toString().map { it.digitToInt() }.sumOf { it } == 0


fun main() {
    println(hashad(10000))
    println(hashad(11))
    println(hashad(12))
    println(hashad(13))
}