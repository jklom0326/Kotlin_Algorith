fun main() {
    val n = readln().toInt()
    val p = readln().split(" ").map { it.toInt() }.toIntArray()
    val s = readln().split(" ").map { it.toInt() }.toIntArray()

    var count = 0
    val card = IntArray(n) { 0 }

    repeat(n) {
        card[it] = it % 3
    }

    while (!card.contentEquals(p)) {
        val temp = card.clone()

        for (i in 0 until n) card[i] = temp[s[i]]

        if (count > 200000) {
            println(-1)
            return
        }

        count++
    }
    println(count)
}
