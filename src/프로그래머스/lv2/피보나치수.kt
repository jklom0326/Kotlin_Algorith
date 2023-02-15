package 프로그래머스.lv2

fun fiboLv2(n: Int): Int {
    val answer = IntArray(n + 1)
    answer[0] = 0
    answer[1] = 1
    for (i in 2..n) {
        answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567
    }
    return answer[n]
}

fun main() {
    println(fiboLv2(3))
    println(fiboLv2(5))
}