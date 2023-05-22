package 기본수학문제

import kotlin.math.sqrt

fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    var count = 0
    for (i in 0 until n){
        if (prime(arr[i])){
            count++
        }
    }
    println(count)
}

fun prime(num: Int): Boolean {
    if (num == 1){
        return false
    }
    for (i in 2 .. sqrt(num.toDouble()).toInt()) {
        if (num % i == 0) return false
    }
    return true
}
