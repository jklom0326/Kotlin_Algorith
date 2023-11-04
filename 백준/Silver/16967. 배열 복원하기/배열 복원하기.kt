fun main() {
    val (H, W, X, Y) = readln().split(" ").map { it.toInt() }
    val arrA = Array(H) { IntArray(W) }
    val arrB = arrayListOf<List<Int>>()
    repeat(H + X) {
        val input = readln().split(" ").map { it.toInt() }
        arrB.add(input)
    }
    for (i in 0 until H) {
        for (j in 0 until W) {
            arrA[i][j] = arrB[i][j]
        }
    }

    for (i in X until H) {
        for (j in Y until W) {
            arrA[i][j] = arrB[i][j] - arrA[i - X][j - Y]
        }
    }
    arrA.forEach {arr ->
        arr.forEach {
            print("$it ")
        }
        println()
    }
}