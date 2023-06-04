fun main() {
    val nk = readln().split(" ").map { it.toInt() }
    val list = readln().split(" ").map { it.toInt() }
    var sum = 0
    list.forEach {
        if (it % 2 == 0) {
            sum += (it / 2)
        } else {
            sum += (it / 2) + 1
        }
    }
    if (nk[0] <= sum) println("YES") else println("NO")
}