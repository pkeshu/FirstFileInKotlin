package StringTemplate_Interpretation

fun main(args:Array<String>){
    val name="Keshar"
    val str="Hello $name"
    println("The Statement is $str. The number of character in the statement is ${str.length}")

    val a=10
    val b=15

    println("The sum of $a and $b is: ${a+b}")

    var rect=Rectangle()
    rect.length=5
    rect.breadth=10
    println("The length of rectangle is :${rect.length} and breadth of rectangle is: ${rect.breadth}. The Area of rectangle is: ${rect.length*rect.breadth}")

}
class Rectangle{
    var length:Int =0
    var breadth:Int =0

}