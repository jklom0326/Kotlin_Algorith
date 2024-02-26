fun main() {
    val n = readln().toInt()
    val fivo = Array(41) { IntArray(2) }

    fivo[0][0] = 1
    fivo[0][1] = 0
    fivo[1][0] = 0
    fivo[1][1] = 1

    for (i in 2..40) {
        fivo[i][0] = fivo[i - 1][0] + fivo[i - 2][0]
        fivo[i][1] = fivo[i - 1][1] + fivo[i - 2][1]
    }

    repeat(n) {
        val m = readln().toInt()
        println("${fivo[m][0]} ${fivo[m][1]}")
    }
}