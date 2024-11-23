fun main(args: Array<String>) {
    var numero : Int = 0
    var suma : Int  = 0
    var media : Int  = 0
    var i : Int = 1

    println("Dime  numeros para la media")
    numero = readln().toInt()

    for (i in 1..numero ){
        suma+=i
    }
    println("la suma es $suma")
    println("la media ${suma/numero}")
}