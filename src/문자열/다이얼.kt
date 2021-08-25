package 문자열

fun main() {
    val n = readLine()!!
    var result = 0
    for (i in n)
        when (i.toInt() - 64) {
            in 1..3 -> result += 3 // abc
            in 4..6 -> result += 4 // def
            in 7..9 -> result += 5 // ghi
            in 10..12 -> result += 6 // jkl
            in 13..15 -> result += 7 //mno
            in 16..19 -> result += 8 //pqrs
            in 20..22 -> result += 9 // tuv
            in 23..26 -> result += 10 // wxyz
        }
    println(result)
}