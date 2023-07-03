fun main() {

    val (n, m, k) = readln().split(" ").map { it.toInt() }

    val list = Array(n) { IntArray(m) }
    val visit = Array(n) { IntArray(m) }
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)

    repeat(k) {
        val area = readln().split(" ").map { it.toInt() }
        for (i in area[0] until area[2]) {
            for (j in area[1] until area[3]) {
                list[j][i] = 1
            }
        }
    }

    var num = 0 // 영역수
    var ar = mutableListOf<Int>()  // 값

    repeat(n) { i ->
        for (j in 0 until m) {
            if (visit[i][j] == 1 || list[i][j] == 1) continue
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
                    if (visit[nx][ny] == 1 || list[nx][ny] != 0) continue; // 이미 방문한 칸이거나 파란 칸이 아닐 경우
                    visit[nx][ny] = 1
                    queue.add(Pair(nx, ny))
                }
            }
            ar.add(area)
        }
    }
    println(num)
    println(ar.sorted().joinToString(" "))
}