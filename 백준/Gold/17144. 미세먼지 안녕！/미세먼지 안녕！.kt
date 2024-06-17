fun main() {
    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)
    var (r, c, t) = readln().split(" ").map { it.toInt() }
    val map = Array(r) { IntArray(c) }
    var cleanerRow = -1

    repeat(r) { i ->
        val line = readln().split(" ").map { it.toInt() }
        repeat(c) { j ->
            map[i][j] = line[j]
            if (line[j] == -1 && cleanerRow == -1) {
                cleanerRow = i
            }
        }
    }

    while (t-- > 0) {
        val dusts = ArrayList<Dust>()
        for (i in 0 until r)
            for (j in 0 until c)
                if (map[i][j] >= 5) dusts.add(Dust(i, j, map[i][j]))

        for (dust in dusts) {
            var count = 0
            for (j in 0..3) {
                val dr: Int = dust.row + dx[j]
                val dc: Int = dust.col + dy[j]
                if (dr < 0 || dc < 0 || dr >= r || dc >= c) continue
                if (map[dr][dc] == -1) continue
                map[dr][dc] += dust.vol / 5
                count++
            }
            map[dust.row][dust.col] -= dust.vol / 5 * count
        }

        for (i in cleanerRow - 2 downTo 0) map[i + 1][0] = map[i][0]
        for (i in 0 until c - 1) map[0][i] = map[0][i + 1]
        for (i in 0 until cleanerRow) map[i][c - 1] = map[i + 1][c - 1]
        for (i in c - 1 downTo 2) map[cleanerRow][i] = map[cleanerRow][i - 1]
        map[cleanerRow][1] = 0

        for (i in cleanerRow + 2 until r - 1) map[i][0] = map[i + 1][0]
        for (i in 0 until c - 1) map[r - 1][i] = map[r - 1][i + 1]
        for (i in r - 1 downTo cleanerRow + 2) map[i][c - 1] = map[i - 1][c - 1]
        for (i in c - 1 downTo 2) map[cleanerRow + 1][i] = map[cleanerRow + 1][i - 1]
        map[cleanerRow + 1][1] = 0
    }
    var sum = 0
    repeat(r) { i ->
        repeat(c) { j ->
            sum += map[i][j]
        }
    }
    println(sum + 2)
}

data class Dust(
    val row: Int,
    val col: Int,
    val vol: Int,
)
