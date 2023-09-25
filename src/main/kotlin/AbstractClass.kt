fun main(){
    val pentagon = Pentagon(5.0)
    println(pentagon.area())
    pentagon.display()
}
abstract class Polygon(){
    abstract fun area(): Double
    abstract fun display()
}
class Pentagon(val n : Double) : Polygon(){
    override fun area(): Double = 0.5 * n * n
    override fun display() {
        println("This is Pentagon class")
    }
}

abstract class A(){
    fun b() = print("Hello")
}