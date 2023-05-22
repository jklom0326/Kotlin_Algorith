package if문

fun main() {
    val a = readLine()!!.toInt()
    when(a){
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}