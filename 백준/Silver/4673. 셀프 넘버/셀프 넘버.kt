fun main() {
    val arr = mutableListOf<Int>()

    repeat(10000) {
        var result = it + 1
        var div = it + 1
        while (div > 0) {
            result += div % 10
            div /= 10
        }
        arr.add(result)
    }
    for (i in 1 until 10000) {
        if (arr.contains(i)){
            continue
        } else {
            println(i)
        }
    }
}