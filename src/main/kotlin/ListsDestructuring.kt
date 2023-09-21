fun main(){
    val names = listOf(
        "Ali","Kumail","Amjad","Shehrose"
    )

    /* Following way can be done easily through destructuring
        val a = names[0]
        val am = names[1]
        val amj = names[2]
    */
    val (a,b,c) = names
    println("$a, $b, $c are the first three members of the list" )

    val (d,e,_,f) = names
    println("$d,$e,$f")

}