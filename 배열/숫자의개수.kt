package 배열

fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val array = IntArray(10)
    var multi = a* b * c

    while (multi != 0){
        array[multi%10]++
        multi /= 10
    }
    for (i in array.indices){
        println(array[i])
    }
}