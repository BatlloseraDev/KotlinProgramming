fun main() {
    //1º DAW
    //Ejercicio 13
    //José García Aguilar
    println("Ejercicio 13")
    println("Restas sucesivas")

    var num1 : Int = 0
    var num2 : Int = 0
    var num3 : Int = 0
    var cociente : Int = 1

    print("Introduce el primer número: ")
    num1 = readln().toInt()
    print("Introduce el segundo número: ")
    num2 = readln().toInt()

    if (num1 > num2){
        num3 = num1 - num2

        while (num3 > 0){
            num3 -= num2
            cociente++
        }
        if (num3 < 0){
            num3 += num2
            cociente--
        }
        println("El cociente es de $cociente")
        println("El resto es de $num3")
    } else if (num2 > num1){
        num3 = num2 - num1

        while (num3 > 0){
            num3 -= num1
            cociente++
        }
        if (num3 < 0){
            num3 += num1
            cociente--
        }
        println("El cociente es de $cociente")
        println("El resto es de $num3")
    } else {
        println("Ambos números son iguales")
    }
}
