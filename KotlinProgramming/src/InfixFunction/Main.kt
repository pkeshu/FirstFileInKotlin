package InfixFunction

fun main(args: Array<String>) {
    val x: Int = 6
    val y: Int = 7
    val greaterVal = x greaterValue y
    println(greaterVal)
}

infix fun Int.greaterValue(other: Int): Int = if (this > other) this else other