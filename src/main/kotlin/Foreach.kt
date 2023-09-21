fun main(){
    val names = listOf(
        "Ali",
        "Umair",
        "Uzair",
        "Jamal",
        "Hassan"
    )
    println("Simple for loop")
    for(name in names) println(name)
    println("-----------------ForEach loop-----------------")
    names.forEach {
        println(it)
    }
}