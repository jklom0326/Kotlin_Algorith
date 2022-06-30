package 구현

import 재귀.arr

fun main() {
    val str = readLine()!!.toString()
    println(stringToInt(str))
}

fun stringToInt(string: String): Int {
    var result = string
    val numArray = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    for (i in 0 until 9) {
        result = result.replace(numArray[i], i.toString())
    }
    return result.toInt()
}
