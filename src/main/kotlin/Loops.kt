fun main(){

    val names = listOf("uzair","ali","umair","numair")
    val numbers = intArrayOf(1,2,3,4,5,6,7,9)

    for(name in names){
        println(name)
    }

    for(name in names){
        val n = name.replaceFirstChar {
            it.uppercase()
        }
        println(n)
    }

    for(n in numbers){
        println(n)
    }
}