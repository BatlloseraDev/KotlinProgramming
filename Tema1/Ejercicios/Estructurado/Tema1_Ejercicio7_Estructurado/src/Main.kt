//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Ejercicio 7
    println("Escribe un año para saber si es bisiesto")
    var anio = readln().toInt()
    if ((anio%4 == 0 && anio%100!=0)|| (anio%100==0 && anio%400==0)) println("Es bisiesto")
    else println("No es bisiesto")

}