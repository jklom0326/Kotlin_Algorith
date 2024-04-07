fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val line = readln().split(" ").map { it.toInt() }.toMutableList()
    val robot = IntArray(n).toMutableList()
    var level = 1
    var count = 0

    while (true) {
        // 1
        val tmp = line.last()
        line.add(0, tmp)
        line.removeLast()

        robot.removeLast()
        robot.add(0, 0)
        robot[n - 1] = 0

        // 2
        for (i in n - 2 downTo 0) {
            if (robot[i] != 0 && robot[i + 1] != 1 && line[i + 1] != 0) {
                robot[i + 1] = 1
                robot[i] = 0
                line[i + 1]--
                if (line[i + 1] == 0) {
                    count++
                }
            }
        }

        // 3
        if (line[0] != 0) {
            robot[0] = 1
            line[0]--
            if (line[0] == 0) {
                count++
            }
        }

        if (count >= k) {
            break
        } else {
            level++
        }
    }
    println(level)
}
