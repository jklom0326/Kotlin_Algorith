package 프로그래머스.lv1

fun divNumArray(arr: IntArray, divisor: Int): IntArray {
    var answer = intArrayOf()
    for (i in arr.indices){
        if (arr[i] % divisor == 0) answer += arr[i]
    }
    if (answer.isEmpty()) return intArrayOf(-1)
    return answer.sortedArray()
}

fun main() {
    println(divNumArray(intArrayOf(5,9,7,10),5))
    println(divNumArray(intArrayOf(2,36,1,3),1))
    println(divNumArray(intArrayOf(3,2,5),10))
}