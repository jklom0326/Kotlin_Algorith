package if문

fun main() {
    val n = readLine()!!.split(" ").map { it.toInt()}

    if (n[0] == n[1] && n[1] == n[2]){
        println(10000 + (n[0] * 1000))
    } else if (n[0] == n[1] || n[1] == n[2] || n[0] == n[2]){
        when {
            n[0] == n[1] -> {println(1000 + (n[0] * 100))}
            n[1] == n[2] -> {println(1000 + (n[1] * 100))}
            n[2] == n[0] -> {println(1000 + (n[2] * 100))}
        }
    } else {
        println(n.maxOrNull()!! * 100)
    }
}