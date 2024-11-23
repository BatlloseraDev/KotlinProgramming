//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio 12
    println("Introduce 3 numeros para saber si son consecutivos\nIntroduce el primer numero")
    //Entiendo de  que si sigue al dinamica anterior no hace falta ordenarlos
    var n1= readln().toInt()
    println("Introduce el numero 2")
    var n2= readln().toInt()
    println("Introduce el numero 3")
    var n3= readln().toInt()

    if((n2== n1+1) && (n3== n2+1)) println("Los numeros son consecutivos")
    else println("No son consecutivos")

}