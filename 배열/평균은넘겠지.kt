package 배열


fun main() {
    val n = readLine()!!.toInt()
    val arr = Array(n) { "" }
    for (i in arr.indices) {
        val input = readLine()!!.toString()
        arr[i] = input
    }

    arr.forEach {
        val line = it.split(" ").map { it.toInt() }
        val aver = (line.sumBy { it } - line[0]) / line[0]
        val human = line[0]
        var count = 0
        for (i in line) {
            if (i == human){
                continue
            }
            if (i > aver) {
                count++
            }
        }
        val stu = String.format("%.3f", (count.toDouble() / human.toDouble()) * 100)
        println("$stu%")

    }
}