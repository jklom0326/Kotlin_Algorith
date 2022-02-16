package 재귀

lateinit var arr : Array<Array<Char>>

fun main() {
    val n = readLine()!!.toInt()
    val builder = StringBuilder()
    arr = Array(n) { Array(n) { ' ' } }
    star(n,0,0)
    for (i in 0 until n){
        for (j in 0 until n){
            builder.append(arr[i][j])
        }
        builder.append("\n")
    }
    print(builder)
}

fun star(n : Int, x : Int, y : Int) {
    if (n == 1){
        arr[x][y] = '*'
        return
    }
    val value = n / 3

    for (i in 0 until 3){
        for (j in 0 until 3){
            if ((i == 1) && (j == 1))
                continue
            else
                star(value, x + (value * i), y + (value * j))
        }
    }
}