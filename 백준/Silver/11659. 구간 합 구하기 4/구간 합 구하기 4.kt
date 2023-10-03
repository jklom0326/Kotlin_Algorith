import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val br = BufferedReader(InputStreamReader(System.`in`))
    var st: StringTokenizer
    val arr = IntArray(n + 1)

    st = StringTokenizer(br.readLine())
    for (i in 1..n) {
        arr[i] = arr[i - 1] + st.nextToken().toInt()
    }

    repeat(m) {
        st = StringTokenizer(br.readLine())
        val start = st.nextToken().toInt()
        val end = st.nextToken().toInt()

        println(arr[end] - arr[start - 1])
    }
}