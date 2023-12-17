fun main() {
    var (n, k) = readln().split(" ").map { it.toInt() }
    var result = 0
    
    while (Integer.bitCount(n) > k) {
        result += n and -n
        n += n and -n
    }
    
    println(result)
}