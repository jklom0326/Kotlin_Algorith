package 문자열

fun main() {
    val n = readLine()!!.toInt()
    val arr = mutableListOf<String>()
    for (i in 0 until n) {
        val rl = readLine()!!.toString()
        arr.add(rl)
    }
    var num = n
    for (i in arr.indices) {
        val ms = mutableSetOf<Char>()
        for (j in arr[i]){
            if (ms.contains(j)) {
                if (ms.last() == j) {
                    continue
                } else {
                    num--
                    break
                }
            } else {
                ms.add(j)
            }
        }
    }
    println(num)
}