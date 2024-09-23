import java.math.BigInteger

val builder = StringBuilder()

fun main() {
    val n = readln().toInt()
    val step = 2.toBigInteger().pow(n).subtract(BigInteger.ONE)
    builder.append(step).append('\n')
    if (n <= 20) hanoi(n, 1, 2, 3)
    println(builder)
}

fun hanoi(
    n: Int,
    start: Int,
    mid: Int,
    to: Int,
) {
    if (n == 0) return
    hanoi(n - 1, start, to, mid)
    builder.append("$start $to\n")
    hanoi(n - 1, mid, start, to)
}
