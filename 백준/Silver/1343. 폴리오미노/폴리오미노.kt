fun main() {
    val n = readln().toMutableList()
    for (i in 0..n.size) {
        if (i + 3 < n.size) {
            if (n[i] == 'X' && n[i + 1] == 'X' && n[i + 2] == 'X' && n[i + 3] == 'X') {
                n[i] = 'A'
                n[i + 1] = 'A'
                n[i + 2] = 'A'
                n[i + 3] = 'A'
            }
        }

        if (i + 1 < n.size) {
            if (n[i] == 'X' && n[i + 1] == 'X') {
                n[i] = 'B'
                n[i + 1] = 'B'
            }
        }
    }

    n.forEach {
        if (it == 'X') {
            println(-1)
            return
        }
    }
    println(n.joinToString(""))
}