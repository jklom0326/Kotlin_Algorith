package for문

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    repeat(br.readLine().toInt()){
        val t = StringTokenizer(br.readLine())
        val sum = (t.nextToken().toInt() +
                t.nextToken().toInt()).toString()
        bw.write(sum+"\n")
    }
    bw.flush()
    bw.close()
}