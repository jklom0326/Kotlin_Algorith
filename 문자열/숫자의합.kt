package 문자열

fun main() {
    val n = readLine()!!.toInt()
    val num =  readLine()!!.toString()
    val arr = mutableListOf<Int>()
    var result = 0
    for (i in 0 until n) {
        arr.add(num[i].toInt() - 48)
    }
    result = arr.sumBy { it }
    println(result)
}