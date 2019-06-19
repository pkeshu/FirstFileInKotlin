@file:JvmName("MyKotlinFile")
package DefaultFunctionWithInteroprability

fun main(args:Array<String>){

    var result= getVolumn(4,6)
    println("Volumn without passing third argument: $result")
    var result1= getVolumn(4,6,12)
    println("Volumn with passing third argument: $result1")

}
@JvmOverloads
fun getVolumn(l:Int,b:Int,h:Int=20):Int{
    return l*b*h
}