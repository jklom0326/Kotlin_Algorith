package if문

fun main() {
    val (a: Int, b: Int) = readLine()!!.split(" ").map { it.toInt() }

    if (a > b) {
        println(">")
    }
    else if (a < b){
        println("<")
    }
    else{
        println("==")
    }
}