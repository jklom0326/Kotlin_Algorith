fun main() {
    val (n, a, b) = readln().split(" ").map { it.toInt() }
    val tower = mutableListOf<Int>()
    val maxHeight = maxOf(a, b)

    if (a + b > n + 1) {
        println(-1)
        return
    }

    for (i in 1 until a) tower.add(i)
    tower.add(maxHeight)
    for (i in b - 1 downTo 1) tower.add(i)

    if (a == 1) {
        while (tower.size < n) tower.add(1, 1)
    } else {
        while (tower.size < n) tower.add(0, 1)
    }

    for (i in tower) {
        print("$i ")
    }
}
