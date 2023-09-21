
fun main(){
    val names = arrayOf(
        "Uzair","Umair","Ali","Farooq"
    )

    println(names[0])
    println(names[1])
    println(names[2])

    names[0] = "Nadir"
    println(names.size)

    if("Saqib" in names){
        println("Found")
    }
    else{
        println("Not found")
    }
    println(names.contentToString())

var arrayOfNulls =
    arrayOfNulls<String>(5)

    arrayOfNulls.fill("*")
    arrayOfNulls[4] = "Hey there"

    println(arrayOfNulls.contentToString())

}