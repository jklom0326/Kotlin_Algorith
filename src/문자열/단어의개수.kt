package 문자열

fun main() {
    val n = readLine()!!.trim().split(" ").map { it }
    if (n[0] == ""){
        println(0)
    }else{
        println(n.size)
    }
}