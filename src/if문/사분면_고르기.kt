package if문

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    if (a > 0 && b > 0){
        println(1)
    }
    if (a < 0 && b > 0){
        println(2)
    }
    if (a > 0 && b < 0){
        println(4)
    }
    if (a < 0 && b < 0){
        println(3)
    }
}