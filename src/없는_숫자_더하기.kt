fun main() {
    println(solution(intArrayOf(1,2,3,4,6,7,8,0)))
}

fun solution(numbers: IntArray): Int {
    var answer: Int = -1
    val intArray = mutableListOf(0,1,2,3,4,5,6,7,8,9)

    for (i in numbers) {
        intArray.remove(i)
    }
    answer = intArray.sum()
    return answer
}