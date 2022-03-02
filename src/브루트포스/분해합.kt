package 브루트포스

fun main() {
    val n = readLine()!!.toInt()
    val len = n.toString().length
    var result = 0

    for (i in (n - (len * 9)) until n){
        var sum = 0
        var num = i

        while (num != 0){
            sum += num % 10
            num /= 10
        }
        if ((sum + i) == n){
            result = i
            break
        }
    }
    println(result)
}
