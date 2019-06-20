package High_Level_Function

fun main(args: Array<String>) {

    var program = Program()
    program.addTwoNumbers(7, 9)
    program.addTwoNumbers(2, 7, object : MyInterface {
        override fun execute(sum: Int) {
            println(sum)
        }

    })

    var myLambda: (Int) -> Unit = { s -> println(s) }
    program.addTwoNumbers(4, 6, myLambda)

}

class Program {

    fun addTwoNumbers(a: Int, b: Int, lambda: (Int) -> Unit) {  //using high level function way or lambda way

        val sum = a + b
        lambda(sum)

    }

    fun addTwoNumbers(a: Int, b: Int, action: MyInterface) {   //Using Interface way
        val sum = a + b
        action.execute(sum)
    }

    fun addTwoNumbers(a: Int, b: Int) {  //Simple way
        val sum = a + b
        println(sum)
    }
}

interface MyInterface {
    fun execute(sum: Int)
}

