fun main() {
    val n = readln()
    var countZero = 0
    var countOne = 0
    n.split("1").forEach {
        if (it.contains("0")) countZero++
    }
    
    n.split("0").forEach {
        if (it.contains("1")) countOne++
    }
    println(minOf(countZero, countOne))
}