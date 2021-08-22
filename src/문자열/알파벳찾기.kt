package 문자열

fun main() {
    val n = readLine()!!.toString()
    val arr = mutableListOf<Int>()
    val minusarr = mutableListOf<Int>()
    for (i in n.indices){
        arr.add(n[i].toInt()- 97)
    }
    for (i in 0 until 26){
        minusarr.add(-1)
    }
    for (i in arr.indices){
        if (minusarr[arr[i]] == -1){
            minusarr[arr[i]] = i
        } else{
            continue
        }
    }
    for (i in minusarr.indices){
        print("${minusarr[i]} ")
    }
}
