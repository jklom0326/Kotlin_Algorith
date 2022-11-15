
fun game(order: Int): Int {
        var tsn = order.toString().map{it}.filter { it == '3' || it == '6' || it == '9'}
        println(tsn)
        return 1
}
fun main() {
    println(game(	2356789))
}