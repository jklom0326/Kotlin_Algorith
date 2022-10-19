import java.math.BigInteger

fun bead(balls: Int, share: Int): BigInteger = fact(balls) / (fact(balls - share) * fact(share))

tailrec fun fact(n: Int): BigInteger = if(n > 1) n.toBigInteger() * fact(n - 1)  else  BigInteger.ONE

fun main() {
    println(bead(30, 1))
}