package 다이나믹

fun fibo_dynamic(n: Int): Int {
    val arr = mutableListOf(0,1)
    for (i in 2..n + 1) {
        arr.add(arr[i - 1] + arr [i - 2])
    }
    return arr[n]
}

fun main() {
    println(fibo_dynamic(10))
}