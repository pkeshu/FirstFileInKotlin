package RecursiveFunction

import java.math.BigInteger

fun main(args: Array<String>) {
    println(getFabonacciNumber(n = 10000, b = BigInteger("0"), a = BigInteger("1")))
}


tailrec fun getFabonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger =
    if (n == 0) b else getFabonacciNumber(n - 1, a + b, a)

//fun getFabonacciNumber(n: Int, a: BigInteger, b: BigInteger): BigInteger {
//    if (n == 0)
//        return b
//    else
//        getFabonacciNumber(n - 1, a + b, a)
//}