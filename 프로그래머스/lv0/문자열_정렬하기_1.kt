fun sortstringnum(my_string: String) = my_string.map{it}.filter{ it in '0'..'9' }.map { it.digitToInt()}.sorted()
fun main() {
   println(sortstringnum("a1bcde0"))
}