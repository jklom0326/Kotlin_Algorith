import java.util.*

val line = readln().split(" ").map { it.toInt() }
val n = line[0]
val m = line[1]
val graph = MutableList(n + 1) { mutableListOf<Int>() }
val visit = IntArray(n + 1) { -1 }
val result = IntArray(n + 1) { 5000 }
val queue: Queue<Int> = LinkedList()

fun main() {
    repeat(m) { m ->
        val node = readln().split(" ").map { it.toInt() }
        graph[node[0]].add(node[1])
        graph[node[1]].add(node[0])
    }

    for (i in 1..n) {
        for (j in 0..n) {
            visit[j] = -1
        }
        bfs(i)
        var sum = 0
        for (k in 0..n) {
            sum += visit[k]
        }
        result[i] = sum
    }

    var max = Int.MAX_VALUE
    var friends = 0
    for (i in 0..n) {
        if (result[i] < max) {
            friends = i
            max = result[i]
        }
    }
    println(friends)
}

fun bfs(i: Int) {
    visit[i] = 0
    queue.add(i)
    while (!queue.isEmpty()) {
        var a = queue.poll()
        for (node in graph[a]) {
            if (visit[node] == -1) {
                visit[node] = visit[a] + 1
                queue.add(node)
            }
        }
    }
}