fun main(){
    val brand = "Toyota"
    for(l in brand){
        println(l)
    }
    println("reversed")
    for(l in brand.reversed()){
        println(l)
    }
    println("index reversed")
    for(l in brand.indices.reversed()){
        println("$l - ${brand[l]}")
    }
    println("index with value")
    for(l in brand.indices){
        println("$l - ${brand[l]}")
    }

}