package 프로그래머스.lv0

fun coordinate(keyinput: Array<String>, board: IntArray): List<Int> {
    var answer = mutableListOf(0, 0)

    keyinput.forEach {
        when (it) {
            "left" -> answer[0]--
            "right" -> answer[0]++
            "up" -> answer[1]++
            "down" -> answer[1]--
        }
        when {
            answer[0] > board[0] / 2 -> answer[0] = board[0] / 2
            answer[0] < -board[0] / 2 -> answer[0] = -board[0] / 2
            answer[1] > board[1] / 2 -> answer[1] = board[1] / 2
            answer[1] < -board[1] / 2 -> answer[1] = -board[1] / 2
        }
    }
    return answer
}

fun main() {
    println(coordinate(arrayOf("left", "right", "up", "right", "right"), intArrayOf(11, 11)))
    println(coordinate(arrayOf("down", "down", "down", "down", "down"), intArrayOf(7, 9)))
    println(coordinate(arrayOf("left","left","left","right"), intArrayOf(3, 3)))
    println(
        coordinate(
            arrayOf(
                "down",
                "down",
                "down",
                "down",
                "down",
                "down",
                "down",
                "down",
                "down",
                "down",
                "down",
                "down",
                "down",
                "down",
                "down"
            ), intArrayOf(7, 9)
        )
    )
}