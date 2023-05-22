package for문

fun main() {
    val a = readLine()!!.toInt()
    for (i in 1..a){
        val (b,c) = readLine()!!.split(" ").map { it.toInt() }
        println("Case #$i: $b + $c = ${b+c}")
    }
}