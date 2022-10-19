
fun main() {
    fun solution(myString: String) = myString.replace("[aeiou]".toRegex(), "")

    val test1 = "nice to meet you"
    println(solution(test1))
}