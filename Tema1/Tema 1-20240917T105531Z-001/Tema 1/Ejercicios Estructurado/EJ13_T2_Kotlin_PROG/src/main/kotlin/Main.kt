fun main(args: Array<String>) {
    //var sum1=0
    var sum2:Int=0

    println("Dame dos numeros")
    var sum1 = readln().toInt()
    sum2 = readln().toInt()
    var auxsum1 = sum1
    var cociente=0
    if (sum1<sum2){
        sum1 = sum2
        sum2 = auxsum1
        auxsum1 = sum1
    }
    while(sum1>=sum2){
        sum1 = sum1 - sum2
        cociente ++
    }
}