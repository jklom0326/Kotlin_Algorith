import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val line = readln().map { it.toString() }
    val array = LinkedList<String>()
    for (s in line) {
        array.add(s)
    }
    val iterator = array.listIterator(line.size)
    val n = readln().toInt()
    repeat(n) {
        val st = StringTokenizer(br.readLine(), " ")
        when (st.nextToken()) {
            "P" -> {
                iterator.add(st.nextToken())
            }

            "L" -> {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                }
            }

            "D" -> {
                if (iterator.hasNext()) {
                    iterator.next()
                }
            }

            "B" -> {
                if (iterator.hasPrevious()) {
                    iterator.previous()
                    iterator.remove()

                }
            }
        }
    }
    println(array.joinToString(""))
}