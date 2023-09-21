fun main(){
    var nums = intArrayOf(
        1,2,3,4,5,6,7,8
    )
    println("-----------------Case number 1------------------")
    for(n in nums){
        // Continue is used to skip values inside the loop
        if(n == 3 ) continue
        if(n >5) break
        println(n)
    }
    println("-----------------Case number2-------------------")
    for(n in nums){
        if( n%2 == 0 ) continue
        println(n)
    }
    println("-----------------Case number3-------------------")
    for (n in nums){
        if(n%2!=0) continue
        if(n>6) break
        println(n)
    }

}