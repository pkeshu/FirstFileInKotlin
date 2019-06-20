package High_Level_Function

fun main(args: Array<String>) {
    val reverse = Reverse()
//    reverse.reverseAndDisplay("keshar") { s: String -> s.reversed() }
    reverse.reverseAndDisplay("keshar") { it.reversed() }

}

class Reverse {
    fun reverseAndDisplay(str: String, myLambdaFunction: (String) -> String) {
        var result = myLambdaFunction(str)
        println(result)
    }
}