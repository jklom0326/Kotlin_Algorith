fun main() {
    val n = readln().toInt()
    val seq = readln().split(" ").map { it.toInt() }

    val arr = arrayListOf<Int>()
    repeat(n) { i ->
        val num = seq[i]
        if (arr.isEmpty()) {
            arr.add(num)
        } else if (arr[arr.size - 1] < num) {
            arr.add(num)
        } else {
            var min = 0
            var max = arr.size - 1
            while (min < max) {
                val mid = (min + max) / 2
                if (arr[mid] >= num) {
                    max = mid
                } else {
                    min = mid + 1
                }
            }
            arr[max] = num
        }
    }
    println(arr.size)
}