package 프로그래머스.lv0


fun area(dots: Array<IntArray>): Int {
    val width = mutableListOf<Int>()
    val height = mutableListOf<Int>()
    dots.forEach {
        width += it[0]
        height += it[1]
    }
    return (width.maxOf { it } - width.minOf { it }) * (height.maxOf { it } - height.minOf { it })
}


fun main() {
    println(
        area(
            arrayOf(
                intArrayOf(1, 1),
                intArrayOf(2, 1),
                intArrayOf(2, 2),
                intArrayOf(1, 2)
            )
        )
    )
    println(
        area(
            arrayOf(
                intArrayOf(-1, -1),
                intArrayOf(1, 1),
                intArrayOf(1, -1),
                intArrayOf(-1, 1)
            )
        )
    )
}