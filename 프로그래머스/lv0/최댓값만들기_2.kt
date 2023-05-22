package 프로그래머스.lv0

fun bignum(numbers: Array<Int>): Int {
    var answer: Int = numbers[0] * numbers[1]
    for (i in 0 until numbers.size - 1){
        for (j in i + 1 .. numbers.size - 1){
            println("----------------")
            println("num[i] ${numbers[i]}")
            println("num[j] ${numbers[j]}")
            println("----------------")
            if (numbers[i] * numbers[j] > answer) {
                answer = numbers[i] * numbers[j]

                println("answer: $answer")
            }
        }
    }
    return answer
}

fun main() {
    println(bignum(arrayOf(-500, 2)))
    println(("aaaaple").map { it }.sorted())
}