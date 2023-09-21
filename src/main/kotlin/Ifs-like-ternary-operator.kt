
fun main(){
    val num1 = 30
    val num2 = 50

    val value = if(num1 >= num2) ":)" else ":("

    println(value)

    val value1 =
        if(num1 >= num2) ":)"
        else if(num1 == 30) "else if block in ternary"
        else ":("
    println(value1)
}