package Constructor

fun main(args: Array<String>) {

    var student1 = Student1(12,"keshar")
    println("Name is : ${student1.name} and id is: ${student1.id}")

}

class Student1() {
    var id: Int = -1
    var name: String = ""

    constructor(id: Int, name: String) : this() {
        this.id = id
        this.name = name
    }
}

