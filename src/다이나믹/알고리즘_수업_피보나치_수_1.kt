package 다이나믹

private var reculsive_counter = 0
private var dynamic_counter = 0
fun main() {
    val n = readLine()!!.toInt()
    fib_recursive(n)
    fib_dynamic(n)
    println("${reculsive_counter} ${dynamic_counter}")
}

fun fib_recursive(n: Int): Int {
    if (n == 1 || n == 2) {
        reculsive_counter++
        return 1
    } else {
        return fib_recursive(n - 1) + fib_recursive(n - 2)
    }
}

fun fib_dynamic(n: Int) {
    val arr = mutableListOf(0, 1)
    for (i in 2..n + 1) {
        dynamic_counter++
        arr.add(arr[i - 1] + arr[i - 2])
    }
    dynamic_counter -= 2
}

