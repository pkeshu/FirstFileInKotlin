package InHeritance

fun main(args: Array<String>) {

    var animal = Animal()
    animal.color = "White"
    animal.eat()

    var dog = Dog()
    dog.size = 23
    dog.Bark()
    dog.eat()
    dog.color = "Brown"

    var cat = Cat()
    cat.walk = "Ten meter"
    cat.eat()
    cat.Meow()
    cat.color = "Balck"

}

open class Animal {
    var color: String = ""
    fun eat() {
        println("Eat")
    }
}

class Dog : Animal() {
    var size: Int = -1
    fun Bark() {
        println("Hou-Hou")
    }
}

class Cat : Animal() {
    var walk: String = ""
    fun Meow() {
        println("Meow")
    }
}