fun main() {
    val a:Int = readLine()!!.toInt()
    val b:Int = readLine()!!.toInt()
    println(a*(b%10))
    println(a*(b%100 - b%10) / 10)
    println(a*(b/100))
    println(a*b)
}