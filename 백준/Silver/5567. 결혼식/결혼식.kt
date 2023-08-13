private val n = readln().toInt()
private val m = readln().toInt()

private var friend = Array(n + 1) { mutableListOf<Int>() }
private var visit = BooleanArray(n + 1) { false }

private var ans = 0

fun main() {
    repeat(m) {
        val line = readln().split(" ").map { it.toInt() }
        friend[line[0]].add(line[1])
        friend[line[1]].add(line[0])
    }
    visit[1] = true
    dfs(1, 0)
    for (i in 2 until visit.size) {
        if (visit[i]) ans++
    }
    println(ans)
}

private fun dfs(f: Int, depth: Int) {
    if (depth == 2) return
    for (i in 0 until friend[f].size) {
        val next = friend[f][i]
        visit[next] = true
        dfs(next, depth + 1)
    }
}
