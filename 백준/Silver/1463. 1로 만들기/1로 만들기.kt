fun main() {
    var n = readln().toInt()

    var d = IntArray(n + 1)

    for (i in 2..n) {
        d[i] = d[i - 1] + 1
        if (i % 2 == 0) d[i] = minOf(d[i], d[i / 2] + 1)
        if (i % 3 == 0) d[i] = minOf(d[i], d[i / 3] + 1)
    }
    println(d[n])
}