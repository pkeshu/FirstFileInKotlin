package Loops

fun main(args: Array<String>) {
    // for loop

    for (i in 1..10) {
        if (i % 2 == 0)
            println(i)
    }

    //for while loop
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }

    //Do-while loop
    var j = 1
    do {
        println(j + 1)
        j++
    } while (j <= 5)
}