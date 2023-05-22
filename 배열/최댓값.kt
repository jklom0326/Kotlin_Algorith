package 배열

fun main() {
    var maxNum = 0
    var maxLine = 0

    for (i in 0 until 9) {
        val inputNum = readLine()!!.toInt()

        if (maxNum < inputNum) {
            maxNum = inputNum
            maxLine = i
        }
    }

    println("$maxNum\n${maxLine + 1}")
}


