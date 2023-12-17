import java.util.PriorityQueue

fun main() {
    val (n, m, k) = readln().split(" ").map { it.toInt() }
    val beers = arrayListOf<Beer>()
    val queue = PriorityQueue<Int>()
    var count = 0
    var result = -1

    repeat(k) {
        val (p, a) = readln().split(" ").map { it.toInt() }
        beers.add(Beer(p, a))
    }
    beers.sortBy { it.alcohol }

    for (beer in beers) {
        queue.add(beer.prefer)
        count += beer.prefer

        if (queue.size > n) {
            count -= queue.poll()
        }
        if (queue.size == n && count >= m) {
            result = beer.alcohol
            break
        }
    }
    println(result)
}

private data class Beer(val prefer: Int, val alcohol: Int)