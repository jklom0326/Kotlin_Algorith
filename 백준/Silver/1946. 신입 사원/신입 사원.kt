fun main() {
    val t = readln().toInt()
    repeat(t) {
        val clientList = mutableListOf<Worker>()
        val n = readln().toInt()
        var result = 0
        repeat(n) {
            val (p, i) = readln().split(" ").map { it.toInt() }
            clientList.add(Worker(p, i))
        }
        var rank = Int.MAX_VALUE
        clientList.sortBy { it.paper }
        clientList.forEach { worker ->
            if (rank > worker.interview) {
                rank = worker.interview
                result++
            }
        }
        println(result)
    }
}

private data class Worker(val paper: Int, val interview: Int)