fun main(){
    val circles = Circles(4.0)
    println(circles.area())

    println(circles.toString())
}
open class Shapes(){
    open fun area() : Double = 0.0
    override fun toString(): String {
        return "I am Any"
    }
}
class Circles(val radius: Double): Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}
