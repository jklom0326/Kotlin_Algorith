package 기본수학문제

fun main() {
    val n = readLine()!!.split(" ").map { it.toInt() }
    var heightday = (n[2] - n[0]) / (n[0] - n[1])
    val lastday = (n[2] - n[0]) % (n[0] - n[1])

    if (lastday == 0) {
        heightday++
    } else {
        heightday += 2
    }
    println(heightday)
}