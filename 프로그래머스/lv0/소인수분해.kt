package 프로그래머스.lv0

fun soinsu(n: Int): List<Int> {
    var answer = intArrayOf()
    var num = n
    for (i in 2..n){
        while (num % i == 0){
            answer += i
            num /= i
        }
    }
    return answer.toSet().toList()
}

fun main() {
    println(soinsu(420))
}