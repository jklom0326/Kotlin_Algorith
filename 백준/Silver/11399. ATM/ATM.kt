fun main() {
    val n = readln().toInt()
    val p = readln().split(" ").map { it.toInt() }.sorted()
    var result = 0
    var temp = 0

    p.forEach {
        temp += it
        result +=temp
    }
    println(result)
}