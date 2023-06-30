fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val canvas = Array(n) { IntArray(m) }
    val visit = Array(n) { IntArray(m) }
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)

    repeat(n) { i ->
        val line = readln().split(" ").map { it.toInt() }.toMutableList()
        line.forEachIndexed { j, n ->
            canvas[i][j] = n
        }
    }

    var mx = 0
    var num = 0
    repeat(n) { i ->
        for (j in 0 until m) {
            if (canvas[i][j] == 0 || visit[i][j] == 1) continue;
            num++
            var queue = mutableListOf<Pair<Int, Int>>()
            visit[i][j] = 1
            queue.add(Pair(i, j))
            var area = 0
            while (queue.isNotEmpty()) {
                area++
                val cur = queue.removeLast()
                for (dir in 0 until 4) {
                    val nx = cur.first + dx[dir]
                    val ny = cur.second + dy[dir]
                    if (nx < 0 || nx >= n || ny < 0 || ny >= m) continue; // 범위 밖일 경우 넘어감
                    if (visit[nx][ny] == 1 || canvas[nx][ny] != 1) continue; // 이미 방문한 칸이거나 파란 칸이 아닐 경우
                    visit[nx][ny] = 1
                    queue.add(Pair(nx, ny))
                }
            }
            mx = maxOf(mx, area)
        }
    }
    println(num)
    println(mx)
}