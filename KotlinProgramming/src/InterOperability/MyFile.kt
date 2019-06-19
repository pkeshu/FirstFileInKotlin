@file:JvmName("MyCustomKotlinFile")

package InterOperability

fun main(args: Array<String>) {

    var area: Int = MyJavaFile.getArea(4, 8)
    println("Printing Area from Kotlin file: $area")

}

fun add(a: Int, b: Int): Int {
    return a + b
}