fun main(args: Array<String>) {
    val (n, l) = readln().split(" ").map { it.toInt() }
    val list = ArrayList<Dot>()
    var result = 0
    var now = 0
    for (i in 0 until n) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        list.add(Dot(x, y))
    }
    list.sortWith(
        compareBy({ it.x }, { it.x - it.y }),
    )
    for (i in list.indices) {
        val d = list[i]
        val x = d.x
        val y = d.y
        for (j in x until y) {
            if (now < j) {
                result++
                now = j + l - 1
            }
        }
    }
    println(result)
}

data class Dot(var x: Int, var y: Int)
