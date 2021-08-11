package `while`

fun main() {
    while (true){
        val (a:Int, b:Int) = readLine()!!.split(" ").map { it.toInt() }
        if (a==0 && b==0){
            break
        }
        println(a+b)
    }
}