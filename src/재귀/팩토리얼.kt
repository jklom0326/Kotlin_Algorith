package 재귀

fun main() {
    val n = readLine()!!.toInt()
    val result : Int = recursion(n)

    println(result)
}

fun recursion(n: Int): Int{
    if(n <= 1) {
        return 1
    } else {
        return (n * recursion(n - 1))
    }
}