package 배열


fun main() {
    val n = readLine()!!.toInt()
    val array = readLine()!!.split(" ").map { it.toDouble() }.toMutableList()
    val max = array.maxOrNull()
    var sum = 0.0
    for (i in array.indices){
        sum += newScore(array[i], max!!.toDouble())
    }
    println(sum/n)

}

private fun newScore(score: Double, max: Double): Double {
    return score / max * 100
}