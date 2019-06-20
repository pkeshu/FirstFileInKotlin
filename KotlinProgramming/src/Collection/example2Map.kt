package Collection

fun main(arg: Array<String>) {
    var immutableMap = mapOf<Int, String>(2 to "Keshar", 44 to "Vuwan", 56 to "Giri")
    //immutable map

    var mutableMap = mutableMapOf<Int, String>()
    mutableMap[2] = "Keshar"
    mutableMap.put(44, "Vuwan")
    mutableMap.put(56, "Giri")

    /*
    * or we can use
    *
    * var map=HashMap<Int,String>()
    *
    * or
    *
    * var map=hashMapOf<Int,String>()*/

    for (key in immutableMap.keys) {
        println("Element at key $key is = ${immutableMap[key]}")
    }

    println()

    for (key in mutableMap.keys) {
        println("Element at key $key is = ${mutableMap[key]}")

    }
}