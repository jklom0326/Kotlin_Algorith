package 프로그래머스.lv0

import kotlin.math.abs

fun nestednumber(array: IntArray, n: Int): Int {
    var sortarr = array.sorted()
    var answer: IntArray = intArrayOf()
        for (i in sortarr){
            answer += abs(n - i)
        }
        return sortarr[answer.indexOf(answer.minOf { it })]
}

fun main() {
    println(nestednumber(intArrayOf(100,0),50))
}