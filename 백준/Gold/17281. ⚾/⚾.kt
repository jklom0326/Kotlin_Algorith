private val n = readln().toInt()
val player = Array(n) { IntArray(9) }
val select = BooleanArray(10) { false }
val lineUp = IntArray(10)
var ans = 0

fun main() {
    repeat(n) { i ->
        val line = readln().split(" ").map { it.toInt() }.toIntArray()
        player[i] = line
    }

    select[3] = true
    lineUp[3] = 0

    dfs(1)
    println(ans)
}

private fun dfs(num: Int) {
    if (num == 9) {
        playBaseBall()
        return
    }

    for (i in 0 until 9) {
        if (select[i]) {
            continue
        }
        select[i] = true
        lineUp[i] = num
        dfs(num + 1)
        select[i] = false
    }
}

private fun playBaseBall() {
    var score = 0
    var startPlayer = 0
    var base: BooleanArray
    for (i in 0 until n) {
        var outCnt = 0
        base = BooleanArray(4)

        outer@ while (true) {
            val hitter = player[i][lineUp[startPlayer]]

            when (hitter) {
                0 -> {
                    outCnt++
                }

                1 -> {
                    for (k in 3 downTo 1) {
                        if (base[k]) {
                            if (k == 3) {
                                score++
                                base[k] = false
                                continue
                            }

                            base[k] = false
                            base[k + 1] = true
                        }
                    }
                    base[1] = true
                }

                2 -> {
                    for (k in 3 downTo 1) {
                        if (base[k]) {
                            if (k == 3 || k == 2) {
                                score++
                                base[k] = false
                                continue
                            }

                            base[k] = false
                            base[k + 2] = true
                        }
                    }
                    base[2] = true
                }

                3 -> {
                    for (k in 3 downTo 1) {
                        if (base[k]) {
                            score++
                            base[k] = false
                        }
                    }
                    base[3] = true
                }

                4 -> {
                    for (k in 1..3) {
                        if (base[k]) {
                            score++
                            base[k] = false
                        }
                    }
                    score++
                }
            }
            startPlayer++
            startPlayer %= 9
            if (outCnt == 3) {
                break@outer
            }
        }
    }

    ans = maxOf(ans, score)
}
