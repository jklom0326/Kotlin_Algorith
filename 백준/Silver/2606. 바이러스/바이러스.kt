val n = readln().toInt()
val m = readln().toInt()

var computer = Array(n + 1) { IntArray(n + 1) }
var visit = BooleanArray(n + 1) { false }

var count = 0

fun main() {
    repeat(m) {
        val line = readln().split(" ").map { it.toInt() }
        computer[line[0]][line[1]] = 1
        computer[line[1]][line[0]] = 1
    }
    dfs(1)
    println(count)
}

fun dfs(pc: Int) {
    visit[pc] = true

    for (i in 1 ..  n) {
        if (!visit[i] && computer[pc][i] == 1) {
            dfs(i)
            count++
        }
    }
}