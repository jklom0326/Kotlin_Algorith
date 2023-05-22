package 입출력

fun main() {
        val (a: Int, b: Int) = readLine()!!.split(" ").map { it.toInt() }
        println(a*b)
}