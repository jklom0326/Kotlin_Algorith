package 프로그래머스.lv0

fun stringleft(A: String, B: String): Int = (B + B).indexOf(A)

fun main() {
    println(stringleft("apple","apple"))
}