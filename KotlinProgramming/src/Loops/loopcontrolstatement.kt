package Loops

fun main(args: Array<String>) {
    //break statement

    myLoop@ for (i in 1..3) {
        for (j in 1..3) {
            println("$i $j")
            if (i == 2 && j == 2)
                break@myLoop
        }

    }

    //continue statement

    for (m in 1..10) {
        if (m % 2 == 0)
            continue
        println(m)
    }



}