fun main() {
    val n = readln().toInt()
    val array = ArrayList<Int>()
    array.run {
        add(1)
        add(2)
        add(4)
    }
    for (i in 3..10) {
        array.add(array[i - 1] + array[i - 2] + array[i - 3])
    }

    repeat(n) {
        val r = readln().toInt()
        println(array[r - 1])
    }
}