package if문

fun main() {
    val t = readLine()!!.split(" ").map { it.toInt() }
    val m = readLine()!!.toInt()

    val minute = (t[0] * 60) + t[1] + m
    if (minute >= 1440){
        println("${(minute / 60) - 24} ${minute % 60}")
    } else{
        println("${(minute / 60)} ${minute % 60}")
    }
}