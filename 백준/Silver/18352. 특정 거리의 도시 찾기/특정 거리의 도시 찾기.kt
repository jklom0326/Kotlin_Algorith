import java.util.LinkedList
import java.util.Queue

fun main() {
    val (n, m, k, x) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { ArrayList<Int>() }
    val visit = IntArray(n + 1) { -1 }

    repeat(m) {
        val (head, next) = readln().split(" ").map { it.toInt() }
        graph[head].add(next)
    }

    val queue = LinkedList<Int>() as Queue<Int>
    queue.offer(x)
    visit[x] = 0

    while (queue.isNotEmpty()) {
        val node = queue.poll()

        for (next in graph[node]) {
            if (visit[next] == -1) {
                queue.offer(next)
                visit[next] = visit[node] + 1
            }
        }
    }
    val result = arrayListOf<Int>()
    for (i in 1..n) {
        if (visit[i] == k) {
            result.add(i)
        }
    }
    if (result.isEmpty()) {
        println(-1)
    } else {
        result.forEach {
            println(it)
        }
    }
}
