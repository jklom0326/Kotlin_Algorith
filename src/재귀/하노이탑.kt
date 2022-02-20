package 재귀

import java.lang.StringBuilder

lateinit var sb:StringBuilder

fun main() {
    val n = readLine()!!.toInt()
    sb.append((Math.pow(2.0, n.toDouble()) - 1).toInt()).append('\n')
    hanoi(n,1,2,3)
    println(sb)
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