//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio 32
    println("Ingresa dos números para mostrar todas sus posibles combinaciones" +
            "\nIngresa el primer numero")
    var n = readln().toInt()
    println("Ingresa el segundo número")
    var m = readln().toInt()

    //esto se haria con dos bucles for
    var i= 1
    var j= 1
    while(i<=n)
    {
        while (j<=m)
        {
            println("n= $i y m= $j ")
            j++
        }
        j=1
        i++

    }

    println("Esas son todas las posibles soluciones")




}