package Collection

fun main(args: Array<String>) {
    var immutableList = listOf<String>("keshar", "Vuwan", "Giri") //immutable list we cant add element or write in it
    var mutableList = mutableListOf<String>() //mutable list we can write in it

    mutableList.add("Keshar")
    mutableList.add("Vuwan")
    mutableList.add("Giri")

//    var arrayList= arrayListOf<String>() //same as mutable list
//    var arrayList= ArrayList<String>()

    for (i in immutableList) {
        println(i)
    }
    /*
    * or
    * for(i in 0..immutableList.size-1{
    * println(immutableList[i])
    * }*/

    println()

    for (i in 0 until mutableList.size) {
        println(mutableList.get(i))
    }

}
