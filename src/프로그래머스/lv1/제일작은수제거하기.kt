package 프로그래머스.lv1

fun removeMinNum(arr: IntArray): IntArray = if (arr.size == 1) intArrayOf(-1) else arr.filter { it != arr.minOf { element -> element } }.toIntArray()

fun main() {
    println(removeMinNum(intArrayOf(4,3,2,1)))
}