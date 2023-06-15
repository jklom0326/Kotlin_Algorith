import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = readln().toInt()
    val deque = LinkedList<Int>()
    val sb = StringBuffer()

    repeat(n) {
        val st = StringTokenizer(br.readLine(), " ")
        when (st.nextToken()) {
            "push_front" -> {
                deque.offerFirst(st.nextToken().toInt())
            }

            "push_back" -> {
                deque.offerLast(st.nextToken().toInt())
            }

            "front" -> {
                if (deque.size == 0) println(-1) else println(deque.first)
            }

            "back" -> {
                if (deque.size == 0) println(-1) else println(deque.last)
            }

            "size" -> {
                println(deque.size)
            }

            "empty" -> {
                if (deque.size == 0) println(1) else println(0)
            }

            "pop_front" -> {
                if (deque.size < 1) println( -1) else println(deque.pollFirst())
            }
            "pop_back" ->{
                if (deque.size < 1) println( -1) else println(deque.pollLast())
            }
        }
    }
}