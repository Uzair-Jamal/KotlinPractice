fun main(){
    val names = mutableListOf(
        "Nadeem","Umair","Joseph","Kumail","David"
    )

    println(names)
    names.remove("Joseph")
    println(names)
    names.add("Farrukh")
    println(names)
    println(names.first())
    println(names.last())
    println(names.contains("David"))
    println(names.isEmpty())

    val emptyList = mutableListOf<Any>()
    println(emptyList.isEmpty())
    println(emptyList)
}