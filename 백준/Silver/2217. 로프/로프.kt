fun main() {
    val n = readln().toInt()
    val array = mutableListOf<Int>()
    repeat(n) {
        array.add(readln().toInt())
    }
    array.sortDescending()
    var max = 0
    repeat(n) {
        val temp = array[it] * (it + 1)
        if (temp > max) max = temp
    }
    println(max)
}