fun main() {
    val mutarr = mutableListOf<Int>()
    for (i in 1 until 10000) {
        mutarr.add(selfnumber(i))
    }
    for (j in 1 until 10000) {
        if (mutarr.contains(j)){
            continue
        }else{
            println(j)
        }
    }
}

fun selfnumber(i: Int): Int {
    var result = i
    var div = i
    while (div > 0) {
        result += div % 10
        div /= 10
    }
    return result
}