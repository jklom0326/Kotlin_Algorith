import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val arr = br.readLine().split(" ").map { it.toInt() }.sorted()
    val budget = br.readLine().toInt()

    var right = arr[n - 1]
    var left = 0

    while (right >= left) {
        val mid = (right + left) / 2
        var result = budget

        for (bud in arr) {
            result -= if (mid > bud) bud else mid
        }

        if (result >= 0) {
            left = mid + 1
        } else {
            right = mid - 1
        }
    }
    println(right)
}