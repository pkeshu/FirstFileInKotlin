package FilterAndSorting

fun main(args: Array<String>) {

    var myNumbers: List<Int> = listOf<Int>(2, 3, 4, 6, 23, 19)

    var mySmallNums: List<Int> = myNumbers.filter { it < 10 }
    for (sn in mySmallNums) {
        println(sn)
    }
    println()
    var mySquaredNums = myNumbers.map { it * it } //num -> num*num

    for (sn in mySquaredNums) {
        println(sn)
    }
    println()

    var mySmallSquaredNums: List<Int> = myNumbers.filter { it < 10 }
        .map { it * it }
    for (ssn in mySmallSquaredNums) {
        println(ssn)

    }
    println()

    var people: List<Person> = listOf<Person>(Person("Keshar", 16), Person("Kaushal", 23), Person("Vuwan", 33))
    var sameNames = people.filter { it.name.startsWith("K") }
        .map { it.name }
    for (name in sameNames) {
        println(name)
    }

}

class Person(var name: String, var age: Int) {

}