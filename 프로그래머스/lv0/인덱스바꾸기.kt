fun main() {
    fun indexchage(my_string: String, num1: Int, num2: Int): String {
        var answer = my_string.map {it.toString()}.toMutableList()
        answer[num1] = my_string[num2].toString()
        answer[num2] = my_string[num1].toString()
        return answer.joinToString("")
    }
}