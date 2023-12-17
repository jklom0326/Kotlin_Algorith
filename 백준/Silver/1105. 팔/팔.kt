fun main() {
    val (l, r) = readln().split(" ").map { it }
    var count = 0

    if (l.length == r.length) {
        for (i in l.indices) {
            if (l[i] != r[i]) {
                break
            } else {
                if (l[i] == '8') count++
            }
        }
    }
    println(count)
}