fun main() {
    val n = readln().toLong()
    var sum = 0L
    var result = 0L
    for (i in 1..n) {
        sum += i
        if (sum > n) {
            result = i - 1
            break
        }
    }
    if (result == 0L){
        println(1)
    } else{
        println(result)
    }
}