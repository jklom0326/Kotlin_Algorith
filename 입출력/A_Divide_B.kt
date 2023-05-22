
fun main() {
    val (a: Double, b: Double) = readLine()!!.split(" ").map { it.toDouble() }
    println(a/b)
}