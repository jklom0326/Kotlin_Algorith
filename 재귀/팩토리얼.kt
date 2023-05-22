package 재귀

fun main() {
    val n = readLine()!!.toInt()
    println(recursion(n))
}

fun recursion(n: Int): Int{
    if(n <= 1) {
        return 1
    } else {
        return (n * recursion(n - 1))
    }
}