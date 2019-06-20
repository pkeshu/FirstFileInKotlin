package Collection

fun main(arg: Array<String>) {
    var mySet = setOf<Int>(2, 54, 3, 1, 0, 9, 9, 9, 8) //immutable set

    var mySet1 = hashSetOf<Int>(2, 54, 3, 1, 0, 9, 9, 9, 8)  //mutable set
    mySet1.add(54)
    mySet1.remove(2)

    for (i in mySet) {
        println(i)
    }
    println()
    for (i in mySet1) {
        println(i)
    }
}