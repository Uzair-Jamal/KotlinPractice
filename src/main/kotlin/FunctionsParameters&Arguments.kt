fun main(){
    greet("Mic",20)
    greet("Michael",10)
    greet("Micheal",16)
    // named argument
    greet(age = 30, name= "Micheala")
    // default argument
    greet("Hibbi")

    functionAsArguments()

    val d = double(10)
    println("Double the number function: $d")

//    food( bar = {
//        println("")
//    })
//
//    food{
//        println("")
//    }

    val (v1, v2) = twoValues()
    println("$v1 $v2")
    val (t1,t2,t3) = threeValues()
    println("$t1 $t2 $t3")
}



fun greet(name:String,age:Int = 2){
    println("Hello $name")
    if(age == 2){
        println("Age is not provided\n")
        return
    }
    if(age>=16) {
        println("$name $age - is an Adult")
    }
    else{
        println("$name $age - is not an Adult")
        }
}

// For single line function we don't require any return type
fun double(n:Int) = n*2 // Like this one as it is a single line function

// For the function having curly braces, return type is must except for unit
//fun double(n: Int):Int{
//    return n*2
//}

// Functions as Arguments
fun functionAsArguments() {
    fun foo(bar: () -> Unit = {}){
        println("bar function")
        bar()
    }
}


// bar function only runs if the parameter will be in the end

//fun food( bar: () -> Unit = {},name: String = ""){
//    println("bar function")
//    bar()
//}

// Returning Multiple values
// Two Values

//Single line function
fun twoValues(): Pair<String, Int> =
    "Hello" to 5

// Three Values
//Single line function
fun threeValues():
        Triple<String, Int, Char> =
    Triple(
        "Hello",
        10,
        'A'
    )
