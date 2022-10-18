fun main() {
    fun planet(age: Int): String {
        var answer = age.toString().map { it }.toMutableList()
        for (i in 0 until answer.size) {
            when (answer[i]) {
                '0' -> answer[i] = 'a'
                '1' -> answer[i] = 'b'
                '2' -> answer[i] = 'c'
                '3' -> answer[i] = 'd'
                '4' -> answer[i] = 'e'
                '5' -> answer[i] = 'f'
                '6' -> answer[i] = 'g'
                '7' -> answer[i] = 'h'
                '8' -> answer[i] = 'i'
                '9' -> answer[i] = 'j'
            }
        }
        return answer.joinToString("")
    }
    println(planet(12345))
}