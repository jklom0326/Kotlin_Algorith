package 재귀

fun main() {
    val str = readLine()!!.toString()
    println( palindrome(str))
}

fun palindrome(str: String):Boolean {
    if (str.length <= 1)
        return true

    if (str[0] == str[str.lastIndex])
    {
        return palindrome(str.substring(1 until str.lastIndex))
    }
    return false
}