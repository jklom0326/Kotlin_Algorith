import java.util.*

fun main() {
    val (n, Q) = readln().split(" ").map { it.toInt() }
    val adj = Array(n + 1) { mutableListOf<IntArray>() }
    for (i in 1 until n) {
        val (p, q, r) = readln().split(" ").map { it.toInt() }
        adj[p].add(intArrayOf(q, r))
        adj[q].add(intArrayOf(p, r))
    }
    for (i in 0 until Q) {
        val (k, v) = readln().split(" ").map { it.toInt() }
        val visit = BooleanArray(n + 1)
        visit[v] = true
        val que: Queue<Int> = LinkedList()
        que.add(v)
        var ans = 0
        while (!que.isEmpty()) {
            val cur = que.poll()
            for (a in adj[cur]) {
                if (!visit[a[0]] && a[1] >= k) {
                    que.add(a[0])
                    visit[a[0]] = true
                    ans++
                }
            }
        }
        println(ans)
    }
}
