package High_Level_Function

fun main(args: Array<String>) {
    val persion = Persion()

    with(persion) {
        name = "Keshar"
        age = 16
    }
    persion.apply {
        name = "Keshar"
        age = 16
    }.startRun()
    println(persion.name)
    println(persion.age)

}

class Persion {
    var name: String = ""
    var age: Int = -1
    fun startRun() {
        println("I am ready to run.")
    }
}