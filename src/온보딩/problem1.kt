package 온보딩

fun solution1(pobi: List<Int>, crong: List<Int>): Int {
    // 예외 처리
    if (!exceptions(pobi, crong)) return -1
    val pobiScore = score(pobi)
    val crongScore = score(crong)
    if (pobiScore == crongScore) return 0

    return if(pobiScore > crongScore) 1 else 2
}

private fun score(score: List<Int>): Int {
    val left = score[0].toString().map { it.digitToInt() }
    val right = score[1].toString().map { it.digitToInt() }
    var leftMul = 1
    var rightMul = 1

    for (i in left) {
        leftMul *= i
    }
    for (i in left) {
        rightMul *= i
    }

    return (listOf(left.sumOf { it }, right.sumOf { it }, leftMul, rightMul).maxOf { it })
}

private fun exceptions(pobi: List<Int>, crong: List<Int>): Boolean {
    when {
        // 왼쪽페이지가 홀수, 오른쪽 페이지가 짝수가 아닐 때
        pobi[0] % 2 == 0 -> return false
        pobi[1] % 2 != 0 -> return false
        crong[0] % 2 == 0 -> return false
        crong[1] % 2 != 0 -> return false
        // 페이지가 연속이 아닐 때

        pobi[0] + 1 != pobi[1] -> return false
        crong[0] + 1 != crong[1] -> return false

        // 페이지가 시작면이나 마지막이 아닐 때
        pobi[0] !in 2..399 -> return false
        pobi[1] !in 2..399 -> return false
        crong[0] !in 2..399 -> return false
        crong[1] !in 2..399 -> return false
    }
    return true
}

fun main() {
    println(solution1(listOf(97, 98), listOf(197, 198)))
    println(solution1(listOf(1, 2), listOf(399, 400)))
    println(solution1(listOf(131, 132), listOf(211, 212)))
    println(solution1(listOf(99, 102), listOf(211, 212)))
//    solution1(listOf(97,98), listOf(197,198))
//    solution1(listOf(97,98), listOf(197,198))
}