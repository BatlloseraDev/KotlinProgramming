import kotlin.math.pow

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    println("Ingresa numero para saber cuantas cifras tiene")
    var n = readln().toInt()
    var contador = 0
    var base = 10.0
    var max:Int = base.pow(6).toInt() -1
    if(n>=-max && n<=max)
    {
        while ((n > 0 || n < 0 )&& contador<6) {
            n /= 10
            contador++
        }
        println("El numero tiene $contador cifras")
    }
    else println("El numero tiene mas de mas de 5 cifras")




}