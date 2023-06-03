fun main() {
    var max = 0
    var ride = 0
    repeat(4){
        var n = readln().split(" ").map { it.toInt() }
        ride += n[1] - n[0]
        max = maxOf(max, ride)
    }
    println(max)
}