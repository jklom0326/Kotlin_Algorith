package 프로그래머스.lv0

fun polynomial(polynomial: String): String {
    var poly = 0
    var num = 0

    for (i in polynomial.split(" + ").map { it }) {
        if ("\\d*(x)$".toRegex().matches(i)) {
            if (i == "x") {
                poly++
            } else {
                poly += i.dropLast(1).toInt()
            }
        } else {
            num += i.toInt()
        }
    }

    return when {
        poly == 1 && num == 0 -> "x"
        poly == 1 && num != 0 -> "x + $num"
        poly == 0 -> "$num"
        num == 0 -> "${poly}x"
        else ->  "${poly}x + $num"
    }
}

fun main() {
    println(polynomial("3x + 7 + x"))
    println(polynomial("7 + x"))
    println(polynomial("x + x + x + x + x"))
    println(polynomial("7 + 7 + 7"))
    println(polynomial("1"))
    println(polynomial("x"))
}