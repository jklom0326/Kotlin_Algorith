fun main() {
    var allBook = readln().toInt()
    repeat(9){
        val book = readln().toInt()
        allBook -= book
    }
    println(allBook)
}