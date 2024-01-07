fun main() {
    val (n, h) = readln().split(" ").map { it.toInt() }
    val up = IntArray(n / 2)
    val down = IntArray(n / 2)
    repeat(n) {
        val num = readln().toInt()
        if (it % 2 == 0) down[it / 2] = num else up[it / 2] = num
    }
    up.sort()
    down.sort()

    var min = n
    var num = 0

    for (i in 1..h) {
        val mid = n / 2
        val walls = wall(mid, up, h - i + 1) + wall(mid, down, i)

        if (min > walls) {
            min = walls
            num = 1
        } else if (min == walls) num++
    }
    println("$min $num")
}

private fun wall(r: Int, arr: IntArray, h: Int): Int {
    var left = 0
    var right = r
    while (right > left) {
        val mid = (left + right) / 2
        if (arr[mid] >= h) right = mid else left = mid + 1
    }

    return arr.size - right
}