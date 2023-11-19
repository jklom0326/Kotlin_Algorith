import java.util.Stack

fun main() {
    val n = readln().toInt()
    val equation = readln()
    val stack = Stack<Double>()
    val num = mutableListOf<Double>()
    repeat(n) {
        num.add(readln().toDouble())
    }
    equation.forEach {
        if (it in 'A'..'Z') {
            stack.push(num[it - 'A'])
        } else {
            val a = stack.pop()
            val b = stack.pop()
            stack.push(calculate(a, b, it))
        }
    }
    println("%.2f".format(stack.pop()))
}

fun calculate(a: Double, b: Double, operate: Char): Double =
    when (operate) {
        '*' -> b * a
        '+' -> b + a
        '-' -> b - a
        else -> b / a
    }