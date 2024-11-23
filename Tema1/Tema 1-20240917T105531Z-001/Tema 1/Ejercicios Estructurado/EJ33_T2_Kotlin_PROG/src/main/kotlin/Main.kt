fun main(args: Array<String>) {
    var i = Int

    println("Ingresa un número")
    var numPrimo = readln().toInt()

    for (i in 2..numPrimo){
        if (numPrimo % i == 0 && i != numPrimo){
            println("no es primo")
            break

        } else{
            if (numPrimo==i){

                println("el número $numPrimo es primo")
            }
        }

    }
}