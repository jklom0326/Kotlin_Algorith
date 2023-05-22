
fun main() {
    fun solution(num_list: IntArray, n: Int):Array<IntArray> {
        var answer: Array<IntArray> = arrayOf<IntArray>()
        var list = num_list.toList().chunked(n)

        return answer
    }
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    println( solution(array, 2))
}