package Range

fun main(args: Array<String>) {
    //Range
    var r1 = 1..5
    //This range contains the number 1,2,3,4,5
    var r2 = 5 downTo 1
    //This range contain the number 5,4,3,2,1
    var r3 = 5 downTo 1 step 2
    //This range contain the number 5,3,1
    val r4 = 'a'..'z'
    //This range contain the values from "a", "b" ..."z"
    var isPresent = 'f' in r4
    var countDown = 10.downTo(1)
    var moveUp=1.rangeTo(10)

}