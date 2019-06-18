fun main(args: Array<String>) {
    var name: String
    name = "Keshar"
    display(name)

    val personObj=Person()
    personObj.display("Keshar paudel")
}

fun display(name: String) {
    println(name)
}

class Person{
    fun display(name:String){
        println(name)
    }
}
