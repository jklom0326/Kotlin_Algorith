package 프로그래머스.lv0

fun oxQuiz(quiz: Array<String>): Array<String> {
    var answer: Array<String> = arrayOf<String>()
    println(quiz.map { it.split(" ").toString() })

    return answer
}

fun main() {
    oxQuiz(arrayOf("3 - 4 = -3", "5 + 6 = 11"))
}