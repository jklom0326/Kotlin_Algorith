import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = readln().split(" ").map { it.toInt() }
    val a = readln().split(" ").map { it.toInt() }.toSortedSet()

    val st = StringTokenizer(br.readLine(), " ")
    repeat(n[1]){
        val b = st.nextToken().toInt()
        if (a.contains(b)){
            a.remove(b)
        }

    }

    if (a.size == 0){
        println(0)
    } else {
        println(a.size)
        println(a.joinToString(" "))
    }
}