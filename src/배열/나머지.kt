package 배열

fun main() {
    var arr = IntArray(10)
    for (i in 0..9) {
        val inputNum = readLine()!!.toInt()
        arr[i] = inputNum % 42
    }
    equals(arr)
}

fun equals(array: IntArray) {
    var result = 0

    for (i in array.indices) {
        var count = 0
        for (j in i + 1 until array.size){
            if (array[i] == array[j]){
                count++
            }
        }
        if (count ==0){
            result++
        }
    }
    println(result)
}