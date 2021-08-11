package `while`

fun main() {
    val insertnum = readLine()!!.toInt()
    var change = ((insertnum % 10) * 10) + ((insertnum / 10 + insertnum % 10) % 10)
    var count = 0

    while (true) {
        if (insertnum == change){
            ++count
            println(count)
            break
        }else {
            change = ((change % 10) * 10) + ((change / 10 + change % 10) % 10)
            count++
        }
    }
}