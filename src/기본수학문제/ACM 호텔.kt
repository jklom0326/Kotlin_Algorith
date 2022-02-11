package 기본수학문제

fun main() {
    val i = readLine()!!.toInt()
    for (j in 1..i) {
        val n = readLine()!!.split(" ").map { it.toInt() }
        val room = n[2] / n[0]
        val floor = n[2] % n[0]

        if (floor == 0){
            println(n[0] * 100 + room)
        } else {
            println(floor * 100 + room + 1)
        }
    }
}