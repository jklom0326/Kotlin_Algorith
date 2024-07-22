private val arr = arrayListOf<Long>()

fun main() {
    val n = readln().toInt()

    if (n <= 10) {
        println(n)
    } else if (n >= 1023) {
        println(-1)
    } else {
        for (i in 0L until 10L) {
            dfs(i)
        }
        arr.sort()
        println(arr[n])
    }
}

private fun dfs(num: Long) {
    arr.add(num)
    val vol = num % 10
    if (vol == 0L) return

    for (i in (vol - 1) downTo 0) {
        dfs(num * 10 + i)
    }
}
