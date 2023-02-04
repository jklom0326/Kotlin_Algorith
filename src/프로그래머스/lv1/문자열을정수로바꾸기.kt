package 프로그래머스.lv1

fun sToi(s: String): Int = s.toInt()

fun main() {
    println(sToi("1234"))
    println(sToi("-1234"))
    println(sToi("+1234"))
    println(sToi("+12345"))
}