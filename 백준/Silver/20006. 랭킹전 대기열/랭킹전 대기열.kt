fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    val allPlayer = ArrayList<Player>()
    val sb = StringBuilder()

    repeat(n) {
        val (level, name) = readln().split(" ").map { it.toString() }
        allPlayer.add(Player(level.toInt(), name))
    }

    for (i in 0 until  n) {
        val room = ArrayList<Player>()
        if (!allPlayer[i].check) {
            for (j in i until  n) {
                if (room.size == m) {
                    break
                }
                val level = allPlayer[j].level
                val name = allPlayer[j].name
                if (!allPlayer[j].check && allPlayer[i].level - 10 <= level && allPlayer[i].level + 10 >= level) {
                    allPlayer[j].check = true
                    room.add(Player(level, name))
                }
            }
            room.sortBy { player -> player.name }

            if (room.size == m) {
                sb.append("Started!\n")
            } else {
                sb.append("Waiting!\n")
            }
            for (p in room) {
                sb.append("${p.level} ${p.name}\n")
            }
        }
    }
    println(sb)
}

private data class Player(val level: Int, val name: String, var check: Boolean = false)