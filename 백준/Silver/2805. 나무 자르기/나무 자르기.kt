fun main() {
    val (n, m) = readln().split(" ").map { it.toLong() }
    val trees = readln().split(" ").map { it.toLong() }

    var min = 0L
    var max = trees.maxOrNull()!!.toLong()


    while (max >= min){
        val mid = (min + max) / 2

        var result = 0L
        trees.forEach {
            if (it > mid) {
                result += it - mid
            }
        }
        if (result >= m) {
            min = mid + 1
        } else {
            max = mid - 1
        }
    }
    println(max)
}