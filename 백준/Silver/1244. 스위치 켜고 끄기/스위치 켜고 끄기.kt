
fun main() {
    val n = readln().toInt()
    val switch = readln().split(" ").map { it.toInt() }.toMutableList()
    val count = readln().toInt()

    repeat(count) {
        var (gender, idx) = readln().split(" ").map { it.toInt() }
        idx--

        when (gender) {
            1 -> {
                for (i in idx until n step (idx + 1)){
                    switchOnOff(i, switch)
                }
            }

            2 -> {
                val min = minOf(n - (idx + 1), idx)

                for (i in 0..min) {
                    if (i != 0) {
                        if (switch[idx - i] == switch[idx + i]) {
                            switchOnOff(idx - i, switch)
                            switchOnOff(idx + i, switch)
                        } else {
                            break
                        }
                    } else {
                        switchOnOff(idx, switch)
                    }
                }
            }
        }
    }

    println(switch
        .chunked(20)
        .joinToString("\n") { it.joinToString(" ") })
}

private fun switchOnOff(idx: Int, switch: MutableList<Int>) {
    if (switch[idx] == 0) {
        switch[idx] = 1
    } else {
        switch[idx] = 0
    }
}
