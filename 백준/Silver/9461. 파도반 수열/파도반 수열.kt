fun main() {
    val n = readln().toInt()

    repeat(n) {
        val padovanNum = readln().toInt()
        println(Padovan(padovanNum))
    }
}

fun Padovan(int: Int): Long {
    val list = mutableListOf<Long>()
    list.add(1)
    list.add(1)
    list.add(1)
    for (i in 3..int) {
        list.add(list[i - 2] + list[i - 3])
    }
    return list[int - 1]
}