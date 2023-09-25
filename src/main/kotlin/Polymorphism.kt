fun main(){
    val circle:Shape = Circle(5.2)
    val square:Shape = Square(4.0)
    val triangle:Shape = Triangle(2.0,5.0)

    val shapes = arrayOf(Circle(2.5),Triangle(3.0,8.0),Square(5.0))

    println(circle.area())
    println(square.area())
    println(triangle.area())

    calculateAreas(shapes)

}

open class Shape{
    open fun area(): Double{
        return 0.0
    }
}

fun calculateAreas(shapes:Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}

class Circle(val radius: Double): Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double): Shape(){
    override fun area(): Double {
        return side * side
    }
}

class Triangle(val b: Double, val h: Double): Shape(){
    override fun area(): Double {
        return 0.5 * b * h
    }
}

