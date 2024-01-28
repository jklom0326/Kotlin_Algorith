fun main() {
    val s = readln()
    val c = s.count { it == 'a' }
    var min = c
    for (i in s.indices) {
        var count = 0
        for (j in i until c + i) {
            if (s[j % s.length] == 'b') count++
        }
        min = minOf(count, min)
    }
    println(min)
}