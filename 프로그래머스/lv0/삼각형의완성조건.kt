package 프로그래머스.lv0

fun triangle(sides: IntArray): Int = sides.sorted()[0] * 2 - 1


fun main() {
    println(triangle(intArrayOf(1, 2)))
    println(triangle(intArrayOf(3, 6)))
    println(triangle(intArrayOf(11, 7)))
}