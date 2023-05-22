package 배열

fun main() {
    val n = readLine()!!.toInt()
    val ansarr = Array(n) { "" }

    for (i in 0 until n) {
        val ans = readLine()!!.toString()
        ansarr[i] = ans
    }
    ansarr.forEach {
        var sum = 0
        var scr = 1
        for (e in it){
            if (e == 'O'){
                sum += scr
                scr++
            } else{
                scr = 1
            }
        }
        println(sum)
    }
}