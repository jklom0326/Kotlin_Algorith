package 프로그래머스.lv1

fun countXUntilN(x: Int, n: Int): List<Long> {
    val answer = mutableListOf<Long>()
    for (i in 1..n) {
        answer += x.toLong() * i
    }
    return answer
}

fun countXUntilN2(x: Int, n: Int): LongArray = LongArray(n) { x.toLong() * (it + 1) }



fun main() {
    println(countXUntilN(2, 5))
    println(countXUntilN(4, 3))
    println(countXUntilN(-4, 2))
    println(countXUntilN(10000000, 1000))
}