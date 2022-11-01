package 프로그래머스.lv0

fun oxQuiz(quiz: Array<String>): Array<String> {
    var answer = arrayOf<String>()
    val quiz = quiz.map { it.split(' ') }.map { it }
    for (i in quiz) {
        if (i[1] == "+") {
            answer += if (i[4].toInt() == i[0].toInt() + i[2].toInt()) "O" else "X"
        } else {
            answer += if (i[4].toInt() == i[0].toInt() - i[2].toInt()) "O" else "X"
        }
    }
    return answer
}

fun main() {
   oxQuiz(arrayOf("3 - 4 = -3", "5 + 6 = 11"))
}