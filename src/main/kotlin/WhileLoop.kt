fun main(){
    println("Case Number 1")
    var number = 0
    while(number<=5){
        println("Number: $number")
        number++
    }
    println("Case Number 2")
    var number2 = 5
    while(number2>=0){
        println("Number $number2")
        number2--
    }
    println("Case Number 3")
    var brand = "Honda"
    var index = brand.length-1
    while(index >= 0){
        println("Index: $index: ${brand[index]}")
        --index
    }

    println("Case Number: 4")
    var brands = "Toyota"
    var indice = 0
    while(indice <= brands.length-1){
        println("Index: $indice: ${brands[indice]}")
        indice++
    }

    println("Case Number: 5")
    var arrays = arrayOf("A","B","C")
    var ind = 0
    while(ind <= arrays.size-1){
        println("$ind: ${arrays[ind]}")
        ++ind
    }
}
