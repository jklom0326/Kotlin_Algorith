package for문

fun main() {
    val (n, x) = readLine()!!.split(" ").map { it.toInt() }
    val array = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    var result = ""

    for (i in array){
        if (x > i){
            result += "$i "
        }
    }
    println(result)
}