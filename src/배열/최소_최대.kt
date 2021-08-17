package 배열

fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

    println("${min(arr)} ${max(arr)}")
}

fun min(array: IntArray): Int{
    var min = array[0]
    for (i in array.indices){
        if (min > array[i]){
            min = array[i]
        }
    }
    return min
}

fun max(array: IntArray):Int{
    var max = array[0]
    for (i in array.indices){
        if (max < array[i]){
            max = array[i]
        }
    }
    return max
}