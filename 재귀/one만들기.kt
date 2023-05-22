package 재귀

fun main() {
    val n = readLine()!!.toInt()
    recursiveOne(n)
}

fun recursiveOne(int: Int) {
    if (int == 1) {
        println(1)
        return
    }
    if (int % 2 == 0) {
        println(int)
        recursiveOne(int / 2)
    } else {
        println(int)
        recursiveOne(int * 3 + 1)
    }
}