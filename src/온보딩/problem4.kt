package 온보딩

fun solution4(word: String): String {
    var result = word
    result = reverseUpper(result)
    result = reverseLower(result)
    return result
}

fun reverseUpper(word: String): String {
    var reverseUpper = word.map { it.code }.toMutableList()
    for (i in 0 until word.length) {
        if (reverseUpper[i].toChar() in 'A'..'Z') {
            reverseUpper[i] = ('A'.code + 'Z'.code) - reverseUpper[i]
        }
    }
    return reverseUpper.map { it.toChar() }.joinToString("")
}

fun reverseLower(word: String): String {
    var reverseLower = word.map { it.code }.toMutableList()
    for (i in 0 until word.length) {
        if (reverseLower[i].toChar() in 'a'..'z') {
            reverseLower[i] = ('a'.code + 'z'.code) - reverseLower[i]
        }
    }
    return reverseLower.map { it.toChar() }.joinToString("")
}

fun main() {
    println(solution4("I love you"))
    println(solution4("I Hate you"))
    println(solution4("yOu love ME"))
    println(solution4("I love you"))
    println(solution4("I love you"))
}