package 프로그래머스.lv0

fun countseven(array: IntArray): Int {
    var answer: String = ""
    for (i in array){
        answer += i
    }
    return answer.map { it }.count { it == '7'}
}

fun main() {

}