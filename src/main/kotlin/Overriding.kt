fun main(){
    val oneplus = OnePlus(typeParams = "SmartPhone")
    oneplus.display()
    println(oneplus.toString())

}

open class Mobile(val type:String){
    open val name:String = ""
    open val size:Int = 5
    fun makeCall() = println("Calling from Mobile")
   open fun display() = println("Simple Mobile Display")
    fun powerOff() = println("Shutting Down")

}

class OnePlus(typeParams:String) : Mobile(typeParams){
    override fun display() {
        super.display()
        return println("OnePlus Display") }

    override val name: String = "OnePlus"
    override val size: Int = 6
    override fun toString(): String {
        return "Name: $name, Size: $size"
    }
}