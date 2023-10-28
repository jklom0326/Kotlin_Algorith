fun main() {
    val n = readln().toInt()
    val student = readln().split(" ").map { it.toInt() }
    val supervisor = readln().split(" ").map { it.toInt() }
    var result = n.toLong()

    student.forEach {
        val count = it - supervisor[0]

        if (count > 0) {
            result += count / supervisor[1]

            if (count % supervisor[1] != 0) {
                result++
            }
        }
    }
    println(result)
}