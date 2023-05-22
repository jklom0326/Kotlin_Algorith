package 문자열

fun main() {
    val n = readLine()!!.toString()
    val arr = arrayListOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var r = n
    for (i in arr.indices) {
        if (n.contains(arr[i])) {
           r = r.replace(arr[i], "A")
        }
    }
    println(r.length)
}