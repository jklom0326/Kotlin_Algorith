fun main() {
    val t = readln().toInt()
    for (t in 1 .. t) {
        val w = readln()
        val k = readln().toInt()

        val alpha = IntArray(26)
        w.forEach {
            alpha[it - 'a']++
        }
        
        if(k == 1) {
            println("1 1")
            continue
        }

        var max = -1
        var min = 100001

        for (i in w.indices) {
            if (alpha[w[i] - 'a'] < k) continue
            var count = 1
            for (j in i + 1 until w.length) {
                if (w[j] == w[i]) count++
                if (count == k) {
                    min = minOf(min, j - i + 1)
                    max = maxOf(max, j - i + 1)
                    break
                }
            }
        }
        if (min == 100001 || max == -1) {
            println(-1)
        } else {
            println("$min $max")
        }
    }
}
