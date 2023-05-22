package 기본수학문제

fun main() {
    val n = readLine()!!.toInt()
    var five = n / 5
    var three = 0
    while (five >= 0){
        if ((n - (five * 5)) % 3 == 0){
            three = (n - (five * 5)) / 3
            break
        } else  {
            five--
        }
    }
    println(five + three)
}