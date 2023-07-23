fun main() {
    val n = readln().toInt()


    val answerArray = BooleanArray(1000) { false }

    for (i in 123..987) {
        val str = i.toString()
        if (str.contains("0")) continue
        if (str[0] == str[1] || str[1] == str[2] || str[0] == str[2]) continue
        answerArray[i] = true
    }
    
    repeat(n) {
        val input = readln().split(" ").map { it.toInt() }
        val baseball = input[0].toString()
        val strike = input[1]
        val ball = input[2]

        for (answer in 123..987) {
            if (answerArray[answer]) {
                var strikeTemp = 0
                var ballTemp = 0

                repeat(3) { first ->
                    val answerFirst = baseball[first]
                    repeat(3) { second ->
                        val answerSecond = answer.toString()[second]
                        if (answerFirst == answerSecond) {
                            if (first == second) {
                                strikeTemp++
                            } else {
                                ballTemp++
                            }
                        }
                    }
                }
                answerArray[answer] = strike == strikeTemp && ball == ballTemp
            }
        }
    }

    var count = 0
    for (i in answerArray) {
        if (i) count++
    }
    println(count)
}