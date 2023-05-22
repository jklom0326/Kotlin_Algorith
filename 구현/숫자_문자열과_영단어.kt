package 구현

fun main() {
    val str = readLine()!!.toString()
    println(stringToInt(str))
}

fun stringToInt(string: String): Int {
    var result = string
    val numArray = arrayOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")
    //withIndex -> index와 value 둘다 받는다
    for ((i, n) in numArray.withIndex()) {
        result = result.replace(n, i.toString())
    }
    return result.toInt()
}
