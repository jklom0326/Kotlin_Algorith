package 문자열

fun main() {
    val n = readLine()!!.toInt()
    repeat(n) {
        val input = readLine()!!.split(" ").map { it }
        val m = input[0].toInt()
        val st = input[1]
        var result = ""
        for (i in st) {
            repeat(m) {
                result += i
            }
        }
        println(result)
    }
}