fun main() {
    val a_Time = readln().split(" ").map { it.toInt() }
    val b_Time = readln().split(" ").map { it.toInt() }
    val c_Time = readln().split(" ").map { it.toInt() }

    officeHour(a_Time)
    officeHour(b_Time)
    officeHour(c_Time)
}

fun officeHour(timeList: List<Int>) {
    var hour = timeList[3] - timeList[0]
    var minute = timeList[4] - timeList[1]
    var second = timeList[5] - timeList[2]

    if (second < 0){
        minute -= 1
        second += 60
    }
    if (minute < 0) {
        hour -= 1
        minute += 60
    }

    println("$hour $minute $second")
}