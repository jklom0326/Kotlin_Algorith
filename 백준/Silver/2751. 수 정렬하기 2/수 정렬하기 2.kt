import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringBuilder()

    val n = br.readLine().toInt()
    val list = mutableListOf<Int>()

    repeat(n){
        list.add(br.readLine().toInt())
    }

    list.sort()

    list.forEach {
        st.append(it).append("\n")
    }
    println(st)
}