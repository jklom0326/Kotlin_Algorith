fun findnum(num: Int, k: Int) = if (num.toString().indexOf(k.toString()) != -1) num.toString().indexOf(k.toString()) + 1 else -1
fun main() {
    println(findnum(29183, 1))
}