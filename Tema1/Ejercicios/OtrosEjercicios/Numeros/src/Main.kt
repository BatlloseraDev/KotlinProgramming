//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Introduce los 3 numeros para ver si son mas que 11 pero menor que 50 y mod de 3")
    println("Introduce numero 1")
    var numero1:Int = readln().toInt()
    println("Introduce numero 2")
    var numero2:Int = readln().toInt()
    println("Introduce numero 3")
    var numero3:Int = readln().toInt()

    var calculo = numero1+numero2+numero3
    if(calculo>11 && calculo<50 &&(calculo%3)==0)
    {
        println("El sumatorio de los tres numeros ($calculo) es mayor de 11, menor que 50 y mod de 3")
    }
    else
    {
        println("El sumatorio de los tres numeros ($calculo) no es mayor de 11 o no es menor de 50 o no es mod 3")
    }



}