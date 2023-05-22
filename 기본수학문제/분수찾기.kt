package 기본수학문제

fun main() {
    val n = readLine()!!.toInt()
    var i = 0
    var sum = 0
    while (i + sum < n) {
        sum += i
        i++
    }
    val deno =if (i % 2 ==0) n - sum else i + 1 - (n - sum)
    val nume = i + 1 - deno
    println("${deno}/${nume}")
}