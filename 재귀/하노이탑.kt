package 재귀

import kotlin.math.pow

val builder = StringBuilder()


fun main() {
    val n = readLine()!!.toInt()
    builder.append((2.0.pow(n.toDouble()) -1).toInt()).append('\n')
    hanoi(n,1,2,3)
    println(builder)

}

fun hanoi(n:Int, start:Int, mid:Int, to:Int){
    if(n == 1){
        builder.append("${start} ${to}\n")
        return
    }
    hanoi(n - 1, start, to, mid)
    builder.append("${start} ${to}\n")
    hanoi(n - 1, mid, start, to)
}