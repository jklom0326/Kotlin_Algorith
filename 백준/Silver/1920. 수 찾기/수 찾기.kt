import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val arrN = br.readLine().split(" ").map { it.toInt() }.sorted().toIntArray()
    val m = br.readLine().toInt()
    val arrM = br.readLine().split(" ").map { it.toInt() }

    arrM.forEach {
        println(binary(arrN, it))
    }
}

fun binary(arr: IntArray, key: Int): Int {
    var right = arr.size - 1
    var left = 0

    while (right >= left) {
        val mid = (right + left) / 2

        if (arr[mid] == key) {
            return 1
        } else if (arr[mid] > key) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }
    return 0
}