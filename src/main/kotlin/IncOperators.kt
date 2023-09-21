
fun main(){
    // ++ & -- operator
    var number = 25
    println(++number)
    println(number)
    println(number++)
    println(number)

    println("---------------------------")
    println(--number)
    println(number)
    println(number--)
    println(number)

    println("---------------------------")
    //plus operators

    var sum = 15 + 15
    var sumString = "15" + "15"

    println("Sum $sum")
    println("Sum String $sumString")

    // Convert from one data type to another data type
    println("---------------------------")

    val number1 = "20"
    println(10 + number1.toInt())
    //println(10.toString() + number1)
    println("10$number1")

    val d = 3.0
    println(d)
    println(d.toInt())



}