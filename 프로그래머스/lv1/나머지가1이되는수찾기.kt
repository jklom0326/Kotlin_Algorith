package 프로그래머스.lv1

fun findRestOne(n: Int): Int {
    var answer = 1
    while (answer <= n){
        if (n % answer == 1) return  answer else answer++
    }
    return answer
}

fun findRestOne2(n: Int) = (1..n).first { n % it == 1 }

fun main() {
    println(findRestOne(10))
    println(findRestOne(12))
    println(findRestOne(100000))
}