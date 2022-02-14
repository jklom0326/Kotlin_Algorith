package 재귀

fun main() {
    val n = readLine()!!.toInt()
    val arr = arrayOf(n, arrayOf(n,{'*'}))

    for (i in 0 until n) {
        println(arr[i])
    }
}

fun star(n : Int, x : Int, y : Int) {
    if (n == 1){

    }
}