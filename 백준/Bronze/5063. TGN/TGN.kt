fun main() {
    var repeat = readln().toInt()
    repeat(repeat){
        val ad = readln().split(" ").map { it.toInt() }
        when {
            ad[1] - ad[2] > ad[0] -> println("advertise")
            ad[1] - ad[2] == ad[0] -> println("does not matter")
            ad[1] - ad[2] < ad[0] -> println("do not advertise")
        }
    }
}