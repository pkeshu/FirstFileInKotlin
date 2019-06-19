package Constructor

fun main(args: Array<String>) {

    var student = Student("Keshar")

}

class Student(var name: String) {
//    var name: String = ""

    init {
//        this.name = name
        println("Name is: $name")
    }
}