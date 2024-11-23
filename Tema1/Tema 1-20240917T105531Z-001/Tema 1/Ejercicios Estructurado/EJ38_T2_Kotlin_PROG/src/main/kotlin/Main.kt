fun main(args: Array<String>) {
    var eleccion:Int=0
    var num1:Int=0
    var num2:Int=0
    var operacion:Int=0

    println("¿Introduzca el número de la operación desee realizar?")
    println("1 - Sumar\n2 - Restar\n3 - Multiplicar\n4 - Dividir")
    eleccion= readln().toInt()
    println("Introduzca el primer número")
    num1= readln().toInt()
    println("Introduzca el segundo número")
    num2= readln().toInt()

    when(eleccion){
        1->{operacion=num1+num2}
        2->{operacion=num1-num2}
        3->{operacion=num1*num2}
        4->{operacion=num1/num2}
    }
    println("El resultado es $operacion")
}