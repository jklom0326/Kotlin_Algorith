package 프로그래머스.lv1

fun sortdes(n: Long): Long = n.toString().map { it }.sortedDescending().joinToString("").toLong()

fun main() {
    println(sortdes(118372))
    println(sortdes(1183721123556))

}