import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = readln().toInt()
    val arr = Array(n) { IntArray(2) }
    repeat(n) { n ->
        val st = StringTokenizer(br.readLine(), " ")
        repeat(2){
            arr[n][it] = st.nextToken().toInt()
        }
    }
    arr.sortBy { it[0] }

    var min = arr[0][0]
    var max = arr[0][1]
    var len = max - min

    for (line in arr) {
        if (line[0] >= min && line[1] <= max) continue
        len += if (line[0] < max) {
            line[1] - max
        } else {
            line[1] - line[0]
        }
        min = line[0]
        max = line[1]
    }
    println(len)
}