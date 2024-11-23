//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {


    println("Ingresa un numero para comprobar si un numero es primo")
    var n = readln().toInt()
    var i = 1
    var contadorDivisores = 0

    while (i<=n)
    {
        if(n%i==0)
        {
            contadorDivisores++
            //println("EL numero es divisible por $i")
        }
        i++
    }
    if(contadorDivisores<=2)
    {
        println("El numero $n es primo")
    }else println("El numero $n no es primo")

}