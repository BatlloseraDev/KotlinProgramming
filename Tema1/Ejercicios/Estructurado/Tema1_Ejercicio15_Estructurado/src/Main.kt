//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Ingresa 3 numeros distintos y te dire cual es el mayor\nIngresa el primer numero")
    var num1= readln().toInt()
    println("ingresa el segundo numero")
    var num2= readln().toInt()
    println("ingresa el tercer numero")
    var num3= readln().toInt()




    if(num1>num2 && num1>num3)
        println("El mayor es el primer numero $num1")
    else if(num2>num3) println("El mayor es el segundo numero $num2")
    else if(num3>num2) println("El mayor es el tercer numero $num3")
    else println("No son tres numeros distintos")

}