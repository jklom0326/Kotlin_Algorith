private val n = readln().toInt()
private val paper = Array(n) { IntArray(n) }
private val count = IntArray(3)

fun main() {
    repeat(n) { line ->
        paper[line] = readln().split(" ").map { it.toInt() }.toIntArray()
    }

    solve(0, 0, n)

    count.forEach {
        println(it)
    }
}

fun same(x: Int, y: Int, n: Int): Boolean {
    for (i in x until x + n) {
        for (j in y until y + n) {
            if (paper[x][y] != paper[i][j]) {
                return false
            }
        }
    }
    return true
}

fun solve(x: Int, y: Int, n: Int) {
    if (same(x, y, n)) {
        count[paper[x][y] + 1]++
    } else {
        val m = n / 3

        for (i in 0 until 3) {
            for (j in 0 until 3) {
                solve(x + i * m, y + j * m, m)
            }
        }
    }
}
