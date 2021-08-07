package for문

fun main() {
    val a = readLine()!!.toInt()

    for (i in 1..a){
        for (j in 1..(a-i)){
            print(" ")
        }
        for (k in 1..i){
            print("*")
        }
        println("")
    }
}