package if문

fun main() {
    val a = readLine()!!.toInt()
    if (a % 4 == 0) {
        if (a % 100 == 0) {
            if (a % 400 == 0) {
                println(1)
                return
            }
            println(0)
            return
        }
        println(1)
    } else {
        println(0)
    }
}