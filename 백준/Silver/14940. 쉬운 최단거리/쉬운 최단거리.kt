import java.lang.StringBuilder
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)
    val notArrived = ArrayList<Node>()
    val start = Node(-1, -1)

    val map = Array(n) { x ->
        val st = StringTokenizer(readlnOrNull())
        Array(m) { y ->
            val num = st.nextToken().toInt()
            if (num == 2) {
                start.x = x
                start.y = y
            } else if (num == 0) {
                notArrived.add(Node(x, y))
            }
            num
        }
    }

    val visited = Array(n) { IntArray(m) { -1 } }

    visited[start.x][start.y] = 0
    val queue = LinkedList<Node>() as Queue<Node>
    queue.offer(start)

    while (queue.isNotEmpty()) {
        val node = queue.poll()

        for (i in 0 until 4) {
            val nx = node.x + dx[i]
            val ny = node.y + dy[i]
            if (nx !in 0 until n || ny !in 0 until m) continue; // 범위 밖일 경우 넘어감
            if (visited[nx][ny] != -1 || map[nx][ny] == 0) continue
            visited[nx][ny] = visited[node.x][node.y] + 1
            queue.offer(Node(nx, ny))
        }
    }
    notArrived.forEach { visited[it.x][it.y] = 0 }

    val sb = StringBuilder()
    visited.forEach {
        it.forEach {
            sb.append(it).append(" ")
        }
        sb.append("\n")
    }
    println(sb)
}

private data class Node(var x: Int, var y: Int)