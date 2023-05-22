package 프로그래머스.lv0

fun StringCaclurator(my_string: String): Int {
    val str = my_string.split(" ").map { it.toString() }
    var answer: Int = str[0].toInt()
    println(str)
    for (i in 0 until str.size){
        if (str[i] == "+"){
            answer += str[i + 1].toInt()
        } else if (str[i] == "-"){
            answer -= str[i + 1].toInt()
        }
    }
    return answer
}
fun main() {
    println(StringCaclurator("4 + 5"))
}