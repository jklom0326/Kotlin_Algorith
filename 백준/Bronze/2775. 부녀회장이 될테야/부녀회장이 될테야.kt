fun main() {
    val t = readLine()!!.toInt()
    val arr = Array(15) {IntArray(15){0}}

    for (i in 0 until 15){
        arr[i][1] = 1
        arr[0][i] = i
    }

    for (i in 1 until 15){
        for (j in 2 until 15){
            arr[i][j] = arr[i][j - 1] + arr[i - 1][j]
        }
    }

    for (i in 0 until t){
        val k = readLine()!!.toInt()
        val n = readLine()!!.toInt()
        println(arr[k][n])
    }
}