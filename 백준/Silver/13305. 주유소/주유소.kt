fun main() {
    val n = readln().toInt()
    val road = readln().split(" ").map { it.toInt() }
    val price = readln().split(" ").map { it.toInt() }

    var sum = 0
    var min = price[0]

    for (i in road.indices) {
        if (price[i] < min)
            {
                min = price[i]
            }
        sum += min * road[i]
    }

    println(sum)
}
