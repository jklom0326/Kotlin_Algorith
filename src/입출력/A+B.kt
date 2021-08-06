
fun main() {
    val (a: Int, b: Int) = readLine()!!.split(" ").map { it.toInt() }
    println(a-b)
}