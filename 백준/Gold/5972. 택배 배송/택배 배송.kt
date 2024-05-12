import java.util.PriorityQueue

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val graph = Array(n + 1) { ArrayList<node>() }

    repeat(m) {
        val (start, end, value) = readln().split(" ").map { it.toInt() }
        graph[start].add(node(end, value))
        graph[end].add(node(start, value))
    }

    println(dijkastra(graph, n))
}

private fun dijkastra(
    graph: Array<ArrayList<node>>,
    n: Int,
): Int {
    val dp = IntArray(n + 1) { Int.MAX_VALUE }
    val pq = PriorityQueue<node> { a, b -> a.value - b.value }
    pq.add(node(1, 0))
    dp[1] = 0
    while (pq.isNotEmpty()) {
        val (next, value) = pq.poll()
        if (dp[next] < value) continue
        if (next == n) return value
        for ((i, v) in graph[next]) {
            if (value + v >= dp[i]) continue
            dp[i] = value + v
            pq.add(node(i, value + v))
        }
    }
    return -1
}

data class node(
    val next: Int,
    val value: Int,
)
