package 프로그래머스.lv0

fun countk(i: Int, j: Int, k: Int): Int = (i..j).map{it}.joinToString("").split("").count{ it == k.toString()}
fun main() {
    println(countk(1, 13, 1))
}