fun main() {
    val x_liter = readln().toInt()
    val y_liter = readln().toInt()
    val y_liter_max = readln().toInt()
    val y_liter_add = readln().toInt()
    val water = readln().toInt()

    val x = x_liter * water
    val y = if (water - y_liter_max >= 0) {
        y_liter + (water - y_liter_max)* y_liter_add
    } else {
        y_liter
    }

    println(minOf(x,y))
}