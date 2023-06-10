fun main() {
    val n = readln().toInt()
    val vip = readln().toInt()

    val seat = mutableListOf<Int>()
    seat.add(1)
    seat.add(1)

    for (i in 2..n){
        seat.add(seat[i - 1] + seat[i - 2])
    }

    var result = 1
    var tmp = 0
    repeat(vip){
        val vipIndex = readln().toInt()
        result *= seat[vipIndex - tmp - 1]
        tmp = vipIndex
    }
    result *= seat[n - tmp]
    println(result)
}