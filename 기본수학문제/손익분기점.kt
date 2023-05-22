package 기본수학문제

fun main() {
    val n = readLine()!!.split(" ").map { it.toInt() }.let {
        if (it[1] >= it[2]) {
            println(-1)
        } else {
            println(it[0] / (it[2] - it[1]) + 1)
        }
    }
}