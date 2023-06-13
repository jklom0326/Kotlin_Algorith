fun main() {

    val n = readln().toInt()
    val fibo = if (n >= 0) {
        positiveFibo(n)
    } else{
        negativeFibo(-n)
    }
    if (fibo > 0){
        println(1)
        println(fibo)
    } else if (fibo == 0){
        println(0)
        println(0)
    } else{
        println(-1)
        println(-fibo)
    }
}

fun negativeFibo(n: Int): Int {
    val arr = mutableListOf<Int>()
    arr.add(0)
    arr.add(1)
    for (i in 2..n) {
        arr.add(((arr[i - 2] - arr[i - 1]) % 1000000000))
    }
    return arr[n]
}

fun positiveFibo(n: Int): Int {
    val arr = mutableListOf<Int>()
    arr.add(0)
    arr.add(1)
    for (i in 2..n) {
        arr.add(((arr[i - 2] + arr[i - 1]) % 1000000000))
    }
    return arr[n]
}