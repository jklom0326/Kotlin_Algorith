private val line = readln().split(" ").map { it.toInt() }
private val n = line[0]
private val m = line[1]
private val campus = Array(n) { CharArray(m) }
private var visit = Array(n) { BooleanArray(m) }
private val dx = intArrayOf(0, 0, -1, 1)
private val dy = intArrayOf(-1, 1, 0, 0)
private var result = 0

fun main() {
    var x = 0
    var y = 0
    repeat(n) { i ->
        val s = readln()
        repeat(m) { j ->
            campus[i][j] = s[j]
            if (campus[i][j] == 'I') {
                y = i
                x = j
            }
        }
    }
    DFS(y, x)
    if (result != 0) {
        println(result)
    } else {
        println("TT")
    }
}

private fun DFS(y: Int, x: Int) {
    visit[y][x] = true
    for (i in 0 until 4) {
        val ny = y + dy[i]
        val nx = x + dx[i]
        if (ny < 0 || nx < 0 || ny >= n || nx >= m || visit[ny][nx] || campus[ny][nx] == 'X') {
            continue
        }
        if (campus[ny][nx] == 'P') {
            result++
        }
        DFS(ny, nx)
    }
}
