fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        dfs(n, 1, 1, 0, 1, "1")
        println()
    }
}

private fun dfs(
    n: Int,
    idx: Int,
    num: Int,
    sum: Int,
    operator: Int,
    expression: String,
) {
    var tmp = sum
    if (idx == n) {
        tmp += (num * operator)
        if (tmp == 0) {
            println(expression)
        }
        return
    }

    dfs(n, idx + 1, num * 10 + (idx + 1), sum, operator, "$expression ${idx + 1}")
    dfs(n, idx + 1, idx + 1, sum + (num * operator), 1, "$expression+${idx + 1}")
    dfs(n, idx + 1, idx + 1, sum + (num * operator), -1, "$expression-${idx + 1}")
}