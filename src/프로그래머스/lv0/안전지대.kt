package 프로그래머스.lv0

fun safetyzone(board: Array<List<Int>>): Int {
    var answer: Int = 0
    board.forEach {
       println(it)
    }
    return answer
}

fun main() {
    safetyzone(
        arrayOf(
            listOf(0, 0, 0, 0, 0),
            listOf(0, 0, 0, 0, 0),
            listOf(0, 0, 0, 0, 0),
            listOf(0, 0, 1, 0, 0),
            listOf(0, 0, 0, 0, 0)
        )
    )
}