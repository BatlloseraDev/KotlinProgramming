//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio 10
    println("Proporciona una temperatura")
    var t = readln().toDouble()
    println("Si estaba en Grados y la quieres pasar a Farenheit pulsa 1" +
            "\nSi estaba en Fanrenheit y la quieres pasar a grados pulsa 2")
    var opc = readln().toInt()
    if(opc ==1)
    {
        var CtoF= (t*(9.0/5.0))+32.0
        println("La temperatura en Farenheits es $CtoF")
    }
    else if (opc==2)
    {
        var FtoC = (t-32.0)*(5.0/9.0)
        println("La temperatura en Grados es $FtoC")
    }
    else println("Opcion no valida, se cierra el programa")

}