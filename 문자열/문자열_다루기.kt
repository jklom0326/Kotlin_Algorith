package 문자열

fun main() {
    println(solution("a234"))
    println(solution("1234"))
    println(solution("1234234"))
    println(solution("66234"))
}

fun solution(s: String) = (s.length == 4 || s.length == 6) && s.toIntOrNull() != null