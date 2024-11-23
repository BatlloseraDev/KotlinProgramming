//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("ingresa 3 numeros \nPrimer numero")

    var num1= readln().toInt()
    println("Segundo numero")
    var num2= readln().toInt()
    println("Tercer numero")
    var num3= readln().toInt()

    if(num3>num2 && num3>num1)
    {
        if(num2>num1) println("Estan ordenados de menor a mayor")
        else println("No estan ordenados de menor a mayor")
    }else println("No estan ordenados de menor a mayor")


}