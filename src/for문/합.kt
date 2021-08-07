package for문

fun main() {
    val a = readLine()!!.toInt()
    var result = 0

    for (i in 1..a){
        result += i
    }
    println(result)
}