package 온보딩

fun solution2(cryptogram: String): String {
    var beforeDecoding = cryptogram
    var afterDecoding = decode(beforeDecoding)
    println(afterDecoding)
    // 암호 해독
    while (beforeDecoding != afterDecoding) {
        beforeDecoding = afterDecoding
        afterDecoding = decode(beforeDecoding)
        println(afterDecoding)
    }
    return afterDecoding
}

private fun decode(cryptogram: String): String {
    val str = cryptogram.map { it.toString() }.toMutableList()
    for (i in 0 until str.size - 1) {
        if (str[i] == str[i + 1]) {
            str[i] = ""
            str[i + 1] = ""
        }
    }
    return str.joinToString("")
}

fun main() {
    solution2("browoanoommnaon")
    solution2("zyelleyz")
    solution2("")
    solution2("zzz")
}
