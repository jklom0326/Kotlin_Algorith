fun main() {
    while (true) {
        val n = readln().split(" ").map { it.toInt() }
        if (n.count { it == 0 } == 3) {
            return
        }
        val sn = n.sorted()
        if ((sn[0] * sn[0]) +(sn[1] * sn[1]) == (sn[2] * sn[2])){
            println("right")
        } else{
            println("wrong")
        }
    }
}