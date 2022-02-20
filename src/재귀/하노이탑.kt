package 재귀

import kotlin.math.pow

fun main() {
    val n = readLine()!!.toInt()
    println((2.0.pow(n.toDouble()) -1).toInt())
    hanoi(n,1,2,3)
}

fun hanoi(n:Int, start:Int, mid:Int, to:Int){
    if(n == 1){
        println("${start} ${to}")
        return
    }
    hanoi(n - 1, start, to, mid)
    println("${start} ${to}")
    hanoi(n - 1, mid, start, to)
}