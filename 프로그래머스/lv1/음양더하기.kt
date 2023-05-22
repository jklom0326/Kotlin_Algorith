package 프로그래머스.lv1

fun posinega(absolutes: IntArray, signs: BooleanArray): Int {
    var answer = 0
    for (i in absolutes.indices) {
        answer += if (!signs[i]) absolutes[i] * -1 else absolutes[i]
    }
    return answer
}

fun main() {
    println(posinega(intArrayOf(4, 7, 12), booleanArrayOf(true, false, true)))
    println(posinega(intArrayOf(1, 2, 3), booleanArrayOf(false, false, true)))
}