
fun main(){

    val name = "Uzair"
    println(name)
    println(name.uppercase())
    println(name.lowercase())
    println(name.length)
    println(name[0])
    println(name[3])
    println(name.isEmpty())

    val age = 30

    // String template
    val msg = "Name: $name , Age: ${age + 1}"
    println(msg)

    // MultiLine String

    val Email = """
        Hey! %s 
          How 
        are you doing?
    """.trimIndent()

    println(Email.format("Ali"))

    // String Comparison
    println("--------------------------------------------------------------")
    val name1 = "Umair"
    val name2 = "Farooq"
    // String technique creates a new object
    val name3 = String("Umair".toCharArray())
    val name4 = "Umair"

    println("== ${name1 == name2}")
    println("=== ${name1 === name2}")
    // === compare memory location for the variables
    println(".equals ${name1.equals(name2)}")

    println("--------------------------------------------------------------")
    println("== ${name1 == name3}")
    println("=== ${name1 === name3}")
    println(".equals ${name1.equals(name3)}")

    println("--------------------------------------------------------------")
    println("== ${name1 == name4}")
    println("=== ${name1 === name4}")
    println(".equals ${name1.equals(name4)}")


    // Heaps
    // val name3 = String("Umair".toCharArray()) this is not the suitable way to make a string variable
    // val name4 = "Umair" Always use this way



}