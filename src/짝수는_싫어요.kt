fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n){
        if (i % 2 != 0) {
            list += i
        }
    }
}