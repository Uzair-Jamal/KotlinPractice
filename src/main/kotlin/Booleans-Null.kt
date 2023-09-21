fun main(){

    val isAdult: Boolean? = null

    // isAdult == true only uses when the variable may have null value
    if(isAdult == true){
        println("not null and true")
    }
    else {
        println("null and false")
    }


    val isTeen = true

    /* otherwise use isTeen, which it either has a true value or false. If it has a
    true value then it goes into if block otherwise into a false block */

    if(isTeen){
        println("not null and true")
    }else{
        println("null and false")
    }

}