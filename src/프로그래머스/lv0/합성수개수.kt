package 프로그래머스.lv0

fun notprime(n: Int): Int {
    var answer = 0
    if (n >= 3) return 0
    for (i in 4 .. n){
        for (j in 2 until i){
            if (i % j == 0){
                answer++
                break
            }
        }
    }
    return answer
}

fun main() {
    println(notprime(15))
}