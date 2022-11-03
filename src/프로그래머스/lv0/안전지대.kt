package 프로그래머스.lv0

fun safetyzone(board: Array<IntArray>): Int {
    var answer: Int = 0
    board.forEach {
       println( it.count() { safe ->
            safe == 0
        })
    }

    return answer
}

fun main() {
    safetyzone(
        arrayOf(
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 0, 0, 0),
            intArrayOf(0, 0, 1, 0, 0),
            intArrayOf(0, 0, 0, 0, 0)
        )
    )
}