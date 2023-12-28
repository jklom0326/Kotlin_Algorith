import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val (n, m) = readln().split(" ").map { it.toInt() }
    val arr = Array(n) { IntArray(n) }
    val dp = Array(n + 1) { IntArray(n + 1) }

    repeat(n) { x ->
        val st = StringTokenizer(br.readLine(), " ")
        repeat(n) { y ->
            arr[x][y] = st.nextToken().toInt()
        }
    }

    for (i in 1..n) {
        for (j in 1..n) {
            dp[i][j] = dp[i - 1][j] + dp[i][j - 1] - dp[i - 1][j - 1] + arr[i - 1][j - 1]
        }
    }

    repeat(m) {
        val st = StringTokenizer(br.readLine(), " ")
        val x1 = st.nextToken().toInt()
        val y1 = st.nextToken().toInt()
        val x2 = st.nextToken().toInt()
        val y2 = st.nextToken().toInt()
        val sum = dp[x2][y2] - dp[x2][y1 - 1] - dp[x1 - 1][y2] + dp[x1 - 1][y1 - 1]
        println(sum)
    }
}
