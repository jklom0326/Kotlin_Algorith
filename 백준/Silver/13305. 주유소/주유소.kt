fun main() {
    val n = readln().toInt()
    val road = readln().split(" ").map { it.toLong() }
    val price = readln().split(" ").map { it.toLong() }

    var sum = 0L
    var min = price[0]

    for (i in road.indices) {
        if (price[i] < min) {
            min = price[i]
        }
        sum += min * road[i]
    }

    println(sum)
}
