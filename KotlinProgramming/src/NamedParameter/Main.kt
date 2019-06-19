package NamedParameter

fun main(args: Array<String>) {

    findVolumn(height = 36, bredth = 90, length = 40)

}

fun findVolumn(length: Int, bredth: Int, height: Int = 10) {
    println("length is : $length")
    println("breadth is : $bredth")
    println("height is : $height")
}