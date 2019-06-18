package FunctionAsAnExpression

fun main(args: Array<String>) {

    var maxvalue = max(4, 6);
    println("Largest value is: $maxvalue")
}

fun max(a: Int, b: Int): Int = if (a > b) {
    println("$a is greater")
    a
} else {
    println("$b is greater")
    b
}