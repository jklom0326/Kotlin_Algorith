fun main() {
    val n = readln().toInt()
    val friends = Array(n) { IntArray(n) { 10000000 } }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) friends[i][j] = 0
        }
    }

    while (true) {
        val (a, b) = readln().split(" ").map { it.toInt() }
        if (a == -1) break
        friends[a - 1][b - 1] = 1
        friends[b - 1][a - 1] = 1
    }

    for (k in 0 until n) {
        for (a in 0 until n) {
            for (b in 0 until n) {
                friends[a][b] = minOf(friends[a][b], friends[a][k] + friends[k][b])
            }
        }
    }

    var min = Int.MAX_VALUE
    val answer = IntArray(n + 1)

    for (i in 0 until n) {
        var result = 0
        for (j in 0 until n) {
            result = maxOf(result, friends[i][j])
        }
        answer[i] = result
        min = minOf(min, result)
    }

    var count = 0
    var chairman = ""

    for (i in 0 until n) {
        if (answer[i] == min) {
            count++
            chairman += "${i + 1} "
        }
    }

    println("$min $count")
    println(chairman)
}
