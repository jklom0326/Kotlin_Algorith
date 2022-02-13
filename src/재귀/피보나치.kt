package 재귀

fun main() {
    val n = readLine()!!.toInt()
    val fibo = fibo(n)
    println(fibo)
}

fun fibo(i: Int):Int {
    if (i >= 2)
        return fibo(i -1) + fibo(i - 2)
    else if (i == 1){
        return 1
    }
    else return 0
}