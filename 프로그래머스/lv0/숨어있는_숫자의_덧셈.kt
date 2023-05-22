package 프로그래머스.lv0

fun seekNumber(my_string: String): Int =
        my_string.replace("[A-Za-z]".toRegex(), " ")
            .split(" ")
            .asSequence()
            .map { it }
            .sumOf { if (it != "") it.toInt() else 0 }


fun main() {
    println(seekNumber("aAb1B2cC34oOp"))
    println(seekNumber("a1b23c10"))
    println(seekNumber("4a1b23c10"))
    println(seekNumber("zzz11a1"))
    println(seekNumber("zzz111"))
    println(seekNumber("zzzzzzzz"))
    println(seekNumber("zzzzzzzz10"))
    println(seekNumber("10zzzzzzzz10"))
}