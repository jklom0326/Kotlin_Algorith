fun main() {
    val ansCount = readln().split(" ").map { it.toInt() }

    repeat(ansCount[0]) {
        val answer = readln().split(" ").map { it.toInt() }
        if (answer[0] != answer[1]) {
            println("Wrong Answer")
            return
        }
    }
    repeat(ansCount[1]) {
        val answer = readln().split(" ").map { it.toInt() }
        if (answer[0] != answer[1]) {
            println("Why Wrong!!!")
            return
        }
    }
    println("Accepted")
}