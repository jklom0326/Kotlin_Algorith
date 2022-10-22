package 프로그래머스.lv0

fun ctrlz(s: String): Int {
    val arr = s.split(" ").map { it }
    val answer = mutableListOf<Int>()
    println(arr)
    for (i in arr) {
        if (i == "Z") {
            if (arr.indexOf(i) != 0) answer.removeLast()
        } else {
            answer += i.toInt()
        }
    }
    return answer.sum()
}

fun main() {
    println(ctrlz("1 2 3 Z Z"))
}