
fun main() {
    val (A: Int, B: Int, C: Int) = readLine()!!.split(" ").map { it.toInt() }
    println((A+B)%C)
    println( ((A%C) + (B%C))%C)
    println((A*B)%C)
    println(((A%C) * (B%C))%C)
}