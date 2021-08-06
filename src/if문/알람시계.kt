package if문

fun main() {
    var (a: Int, b: Int) = readLine()!!.split(" ").map { it.toInt() }
    b += 15
    a -= 1
    if (b >= 60) {
        b -= 60
        a += 1
    }
    when(a){
        -1 -> a += 24
        24 -> a = 0
    }
    println("$a $b")
}