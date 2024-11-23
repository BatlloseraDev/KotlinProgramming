fun main(args: Array<String>) {
    var num1:Int?
    var num2:Int?
    var num3:Int?

    println("Determinaré si los siguentes números introducidos están en orden")
    println("Introduzca el primer número")
    num1= readln().toInt()
    println("Introduzca el segundo número")
    num2= readln().toInt()
    println("Introduzca el tercer número")
    num3= readln().toInt()

    if (num1<num2 && num2<num3){
        println("Los números están en orden")
    }
    else
        println("Los números no están ordenados")

}