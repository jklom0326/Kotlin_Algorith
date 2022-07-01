fun main() {
    println(solution("01033334444"))
}

fun solution(phone_number: String): String {
    var answer = ""
    var asta = ""
    repeat(phone_number.length - 4) {
        asta += "*"
    }
    answer = asta + phone_number.replaceRange(0, phone_number.length - 4, "")
    return answer
}