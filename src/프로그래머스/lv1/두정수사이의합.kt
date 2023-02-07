package 프로그래머스.lv1

fun sumWhileTwoInt(a: Int, b: Int): Long = (minOf(a, b).toLong()..maxOf(a, b).toLong()).sumOf { it }

fun main() {
    println(sumWhileTwoInt(-3, 5))
    println(sumWhileTwoInt(0, 5))
    println(sumWhileTwoInt(1, 5))
    println(sumWhileTwoInt(5, 3))

}