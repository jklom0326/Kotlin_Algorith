fun main() {
    val n = readln().toInt()
    val visit = BooleanArray(n + 1) { false }
    val k = readln().toInt()
    val arr = Array(n) { "" }
    val set = mutableSetOf<String>()

    repeat(n) {
        arr[it] = readln()
    }
    selectCard(k, "", set, n, visit, arr)
    println(set.size)

}

fun selectCard(count: Int, str: String, set: MutableSet<String>, n: Int, visit: BooleanArray, arr: Array<String>) {
    if (count == 0) {
        set.add(str)
        return
    }

    if (count > n) return
    repeat(n) {
        if (!visit[it]) {
            visit[it] = true
            selectCard(count - 1, str + arr[it], set, n, visit, arr)
            visit[it] = false
        }
    }
}