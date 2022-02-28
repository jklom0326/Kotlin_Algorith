package 브루트포스

fun main() {
    val n = readLine()!!.split(" ").map { it.toInt() }
    val card = readLine()!!.split(" ").map { it.toInt() }

    println(blackjack(n, card))
}

private fun blackjack(
    n: List<Int>,
    card: List<Int>
):Int {
    var result = 0
    for (i in 0 until n[0] - 2) {
        if (card[i]> n[1]) continue
        for (j in i + 1 until n[0] - 1) {
            if (card[i] + card[j] > n[1]) continue
            for (k in j + 1 until n[0]) {
                val temp = card[i] + card[j] + card[k]

                if (n[1] == temp) return temp
                if (result < temp && temp < n[1]) {
                    result = temp
                }
            }
        }
    }
    return result
}