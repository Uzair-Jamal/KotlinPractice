fun main(){

    // Object Expression Example

    var testObj = object {
        val x : Int = 10
        fun method(){
            println("I am an object")

        }
    }
    println(testObj.method())

    var obj = object : Cloneable{
        override fun clone() {
            println("I am clone")
        }

    }

    println(obj.clone())

    var obj2 = object : Person("Uzi"){
        override fun fullName() {
            super.fullName()
            println("Anonymous - $name")
        }
    }
    obj2.fullName()

    // Object Expression Practice Ends here

    // Object Declaration starts

    println(C.num)

    B.test()

    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.display()


}

// Object Expression

interface Cloneable{
    fun clone()
}

open class Person(val name: String){
    open fun fullName() = println("Full name: $name")
}


// Object Declaration

object C{
    val num: Int = 10
}

object B{
    val p:Int = 20
    fun test(){
        println("I am Object B")
    }

}

object SharingWidget{
    private var twitterLikes = 0
    private var fbLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFbLikes() = fbLikes++

    fun display() = println("Facebook - $twitterLikes -- Twitter - $fbLikes")

}