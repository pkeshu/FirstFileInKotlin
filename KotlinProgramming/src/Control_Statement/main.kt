package Control_Statement

fun main(args: Array<String>) {
    var a = 5
    var b = 10
    var maxValue: Int

    if (a > b)
        maxValue = a
    else
        maxValue = b
    println(maxValue)

    //if as an expression

    a = 20
    b = 15

    maxValue = if (a > b) {
        println("$a is greater than $b")
        a
    } else {
        println("$b is greater than $a")
        b
    }

    println(maxValue)

    var wExpre = WhenExpression()
    wExpre.WhenExpression()
}

class WhenExpression {

    fun WhenExpression() {
        val x = 11
        var y = 2
        when (x) {
            in 1..20 -> println("X lies in 1 to 20")
            2 -> println("X is 2")
            else -> println("X is unknown")
        }

        //when as an expression

        var str: String = when (y) {
            1 -> "X is 1"
            2 -> "x is 2"
            else -> "X is Unknown"
        }
        println(str)
    }

}
