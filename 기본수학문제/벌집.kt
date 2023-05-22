package 기본수학문제

fun main() {
    val n = readLine()!!.toInt()
    var shell = 1
    var roomnum = 1
    if (n == 1) println(1)
    else {
        while (roomnum < n) {
            roomnum += (shell * 6)
            shell++
        }
        println(shell)
    }
}