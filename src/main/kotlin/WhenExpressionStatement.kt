fun main(){

    // When used as a Statement
   val input = "M"
   when (input){
       "F" -> println("Female")
       "M" -> println("Male")
       else -> {
           println("Unknown Gender")
       }
   }

    // When used as an Expression
    val input2 = "fgfg"
    val gender2 = when (input2){
        "F" -> "Female"
        "M" -> "Male"
        else -> {
            "Unknown Gender 2"
        }
    }
    println(gender2)

    val n1 = 15
    val n2 = 18

    when{
        (n1 >= n2 || n1 <= 30) -> println("first statement")
        (n1 == 100) -> println("second statement")
        (n2 == 100) -> println("Foo")
        else -> println(":(")
    }

    val age = 30
    when (age) {
        in 13..19 -> println("Teenager")
        !in 0..12 -> println("Not a child any more")
        else -> println("Adult")
    }

}