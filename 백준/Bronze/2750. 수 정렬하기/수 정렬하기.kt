fun main() {
    val n = readln().toInt()
    val list = mutableListOf<Int>()

    repeat(n) {
        list.add(readln().toInt())
    }

    list.sort()
    list.forEach {
        println(it)
    }

}