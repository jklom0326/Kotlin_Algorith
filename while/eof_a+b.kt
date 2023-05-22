package `while`

import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    var s :String

    while (readLine().also { s = it } != null){
        val token = StringTokenizer(s)
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        writer.write("${a+b}\n")
    }
    writer.flush()
    writer.close()
    close()
}