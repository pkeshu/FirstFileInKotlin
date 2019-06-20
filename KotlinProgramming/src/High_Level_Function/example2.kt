package High_Level_Function

fun main(args: Array<String>) {

    val mainProgram = MainProgram()
//    mainProgram.addTwoNumbers(b = 6, myLambdaFunc = { x: Int, y: Int -> x + y }, a = 7)

    //or var myLambda:(Int,Int)->(Int)={x:Int,y:Int->x+y}
    //mainProgram.addTwoNumbers(7,6,myLambda)
    var myLambda: (Int, Int) -> (Int) = { x: Int, y: Int -> x + y }
//    mainProgram.addTwoNumbers(7, 6, myLambda)
    mainProgram.addTwoNumbers(7, 6) { x: Int, y: Int -> x + y }

}

class MainProgram {

    fun addTwoNumbers(a: Int, b: Int, myLambdaFunc: (Int, Int) -> Int) {
        var result = myLambdaFunc(a, b)
        println(result)
    }

}