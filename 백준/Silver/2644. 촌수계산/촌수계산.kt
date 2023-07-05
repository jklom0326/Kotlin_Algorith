fun main() {
    val n = readln().toInt()
    val (start, end) = readln().split(" ").map { it.toInt() }
    val m = readln().toInt()
    val edge = Array(n + 1) { ArrayList<Int>() }
    val visit = BooleanArray(101)

    var answer = -1
    repeat(m) {
        val (from, to) = readln().split(" ").map { it.toInt() }
        edge[from].add(to)
        edge[to].add(from)
    }
    fun dfs(start: Int, end: Int, cnt: Int, edge: Array<ArrayList<Int>>){
        if (answer != -1) return
        if (start == end){
            answer = cnt
            return
        }
        for (next in edge[start]) {
            if (visit[next]) continue
            visit[next] = true
            dfs(next, end, cnt + 1 ,edge)
            if (answer != -1) return
        }
    }


    dfs(start, end, 0, edge)
    println(answer)
}
