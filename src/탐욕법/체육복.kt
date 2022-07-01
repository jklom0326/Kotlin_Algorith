package 탐욕법

fun main() {
//    solution(5, intArrayOf(2, 4), intArrayOf(3, 5))
    println(solution(6, intArrayOf(3, 4), intArrayOf(5)))
}

fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
    var answer = 0
    val studentarray = Array(n) { 1 }
    for (i in lost) {
        studentarray[i - 1]--
    }
    for (i in reserve) {
        studentarray[i - 1]++
    }
    for (i in 0 until n) {
        //본인이 도난당했는데
        if (studentarray[i] == 0) {
            //왼쪽이 있고 왼쪽에 여분이 있을때
            if (i != 0 && studentarray[i - 1] == 2) {
                studentarray[i]++
                studentarray[i - 1]--
            }
            // 오른쪽이 있고 오른쪽에 여분이 있을때
            else if (i != n - 1 && studentarray[i + 1] == 2) {
                studentarray[i]++
                studentarray[i + 1]--
            }
        }
    }
    for (i in studentarray) {
        answer += if (i == 2) 1
        else i
    }
    return answer
}