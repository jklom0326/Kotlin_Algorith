import kotlin.math.pow

var count = 0

fun main() {
    val (n, r, c) = readln().split(" ").map { it.toInt() }
    val base = 2.0
    z(base.pow(n).toInt(), r, c)
    println(count)
}

private fun z(
    n: Int,
    x: Int,
    y: Int,
) {
    when {
        n == 1 -> return
        x < n / 2 && y < n / 2 -> z(n / 2, x, y)

        n / 2 in (x + 1)..y -> {
            count += n * n / 4
            z(n / 2, x, y - n / 2)
        }

        n / 2 in (y + 1)..x -> {
            count += (n * n / 4) * 2
            z(n / 2, x - n / 2, y)
        }

        else -> {
            count += (n * n / 4) * 3
            z(n / 2, x - n / 2, y - n / 2)
        }
    }
}
