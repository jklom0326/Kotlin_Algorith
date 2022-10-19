package 프로그래머스.lv0

class Solution {
    fun solution(array: IntArray): IntArray = intArrayOf(array.maxOf { it }, array.indexOf(array.maxOf { it }))

}

fun main() {

}