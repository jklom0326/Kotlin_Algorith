import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

private val br = BufferedReader(InputStreamReader(System.`in`))

private val n = br.readLine().toInt()
private val graph = Array(n) { IntArray(n) }
private val visitedGraph = Array(n) { IntArray(n) }
private val visit = BooleanArray(n + 1)

fun main() {

    repeat(n) { i ->
        val st = StringTokenizer(br.readLine(), " ")

        repeat(n) { j ->
            graph[i][j] = st.nextToken().toInt()
        }
    }

    repeat(n) { start ->

        dfs(start)

        repeat(n) { i ->
            if (visit[i]) {
                visitedGraph[start][i] = 1
            }
        }
        visit.fill(false)
    }
    visitedGraph.forEach {
        println(it.toList().joinToString(" "))
    }
}

private fun dfs(start: Int) {

    for (i in 0 until n) {
        if (!visit[i] && graph[start][i] == 1) {
            visit[i] = true
            dfs(i)
        }
    }
}