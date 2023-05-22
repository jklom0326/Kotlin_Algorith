package 배열

fun main() {
    val arr = readLine()!!.split(" ").map { it.toInt() }
    var answer  = 0.0
    var sum = 0.0
    for (i in arr.indices) {
        sum += arr[i]
    }
    answer = sum / arr.size.toDouble()
}

