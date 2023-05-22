package 프로그래머스.lv1

fun reversed(n: Long): IntArray = n.toString().reversed().map { it.digitToInt() }.toIntArray()

fun main() {
    val m = reversed(12345)
    for (i in 0..4) {
        println(m[i])
    }
//    println(reversed(12345))
//    println(reversed(54321))
}