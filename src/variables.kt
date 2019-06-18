fun main(args: Array<String>) {
    var myString = "Hello keshar"
    var myNumber = 10
    var myDecimal = 10.88
    var myAnotherString: String
    myAnotherString = "hello there"  //mutable String
    println("$myAnotherString :Non modified String")
    val myConstantString = "This is constant String" //This is immutable String
    println(myString)
    println(myNumber)
    println(myDecimal)
    myAnotherString="Modified String"
    println(myAnotherString)
    print("Constant String: $myConstantString")
}
