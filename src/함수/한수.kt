package 함수

fun main() {
    val n = readLine()!!.toInt()
    hansu(n)
}

fun hansu(n: Int) {
    if (n < 100) {
        println(n)
    } else {
        var count = 99
        for (i in 100 until n + 1) {
            val one = (i % 100) % 10
            val ten = (i / 10) % 10
            val hun = i / 100
            if ((hun - ten) == (ten - one)) {
                count++
            }
        }
        println(count)
    }
}