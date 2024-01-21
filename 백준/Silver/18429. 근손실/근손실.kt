private var result = 0
private var nk = readln().split(" ").map { it.toInt() }
private var fitSet = readln().split(" ").map { it.toInt() }.toIntArray()
private val n = nk[0]
private val k = nk[1]
private val chart = BooleanArray(n) { false }

fun main() {
    result = 0
    dfs(500, 0)
    println(result)
}

private fun dfs(sum: Int, idx: Int) {
    if (idx == n) {
        result++
        return
    }
    for (i in 0 until n) {
        if (chart[i]) continue
        chart[i] = true
        if ((sum + fitSet[i] - k) >= 500) {
            dfs(sum + fitSet[i] - k, idx + 1)
        }
        chart[i] = false
    }
}