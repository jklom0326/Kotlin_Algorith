import java.util.LinkedList

fun main() {
    val n = readln().split(" ").map { it.toInt() }.toMutableList()
    val list = readln().split(" ").map { it.toInt() }
    val queue = LinkedList<Int>()

    var count = 0
    var min: Int

    for (i in 1..n[0]) {
        queue.offer(i)
    }

    list.forEach {
        if (queue.indexOf(it) >= n[0] - queue.indexOf(it)) {
            min = n[0] - queue.indexOf(it)
            for (j in 0 until min) {
                val first = queue.pollLast()
                queue.offerFirst(first)
            }
        } else {
            min = queue.indexOf(it)
            for (j in 0 until min) {
                val first = queue.pollFirst()
                queue.offerLast(first)
            }
        }
        queue.pollFirst()
        n[0] -= 1
        count += min
    }
    println(count)
}