package 프로그래머스.lv1

fun solution(n: Int): Int  = n.toString().sumOf { it.digitToInt() }

fun main() {
  println(solution(123))
  println(solution(987))
}