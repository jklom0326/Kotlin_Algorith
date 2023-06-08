fun main() {
    val n = readln().toInt()
    val array = ArrayList<Int>()
    repeat(n) {
        val r = readln().toInt()
        array.add(r)
    }
    if (n <= 2) {
        println(array.sum())
        return
    }
    var answer = ArrayList<Int>()
    answer.add(array[0])
    answer.add(array[1])
    answer.add(array[2])
    for (i in 3 until n) {
        answer.add(minOf(answer[i - 2], answer[i - 3]) + array[i])
    }
    println(array.sum() - minOf(answer[n - 2], answer[n - 3]))
}