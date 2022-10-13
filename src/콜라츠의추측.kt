fun main() {
     println(solution(6))
     println(solution(16))
     println(solution(626331))
}

fun solution(num: Int): Int = collatzrecursive(num.toLong(), 0)

fun collatzrecursive(n: Long, count: Int): Int =
    when {
        count > 500 -> -1
        n == 1L -> count
        else -> collatzrecursive(if (n % 2 == 0L) n / 2 else n * 3 + 1, count + 1)
    }
