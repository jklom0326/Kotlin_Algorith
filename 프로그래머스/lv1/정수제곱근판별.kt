package 프로그래머스.lv1

import kotlin.math.sqrt

fun isSqrt(n: Long): Long {
    val answer = sqrt(n.toDouble())
    if (answer % 1 == 0.0) {
        return (answer + 1).toLong() * (answer + 1).toLong()
    } else
        return -1
}

fun main() {
    println(isSqrt(121))
    println(isSqrt(122))
}