fun main(){

    val n1 = 35
    val n2 = 25

    if (n1 >= n2 && n1 <= 30){
        println(":)")
    }
    else if(n1<=100){
        println("else if block1")
    }else if(n2<=200){
        println("else if block2")
    }
    else{
        println(":(")
    }

    println("some code")

    val value = if(n1 >= n2 && n1 >= 30){
        println("If expression")
        "value answer1"
    }
    else{
        println("else block")
        "value answer2"
    }
    println(value)
}