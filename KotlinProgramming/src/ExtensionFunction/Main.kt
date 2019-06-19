package ExtensionFunction

fun main(args: Array<String>) {

    var student = Student()
    println("Pass Status:" + student.hasPassed(57))
    println("Scholorship Status:" + student.isScholor(57))

    val str1: String = "hello"
    val str2: String = "world"
    val str3: String = "hey"

    println(str3.add(str1, str2))

    var a: Int = 7
    var b: Int = 9
    var greter = a.greater(b)
    println("Greater Number is: $greter")

}

fun String.add(s1: String, s2: String): String {
    return ("$this $s1 $s2")
}

fun Int.greater(x: Int): Int = if (this > x) this else x

fun Student.isScholor(marks: Int): Boolean {
    return marks > 95
}

class Student {
    fun hasPassed(marks: Int): Boolean {
        return marks > 40
    }
}