package 프로그래머스.lv1

fun takeMiddle(s: String): String {
    if (s.length % 2 == 0){
        return s.slice((s.length / 2 - 1) .. (s.length / 2))
    }
    return s[(s.length / 2)].toString()
}


fun main() {
    println(takeMiddle("abcde"))
    println(takeMiddle("qwer"))
}