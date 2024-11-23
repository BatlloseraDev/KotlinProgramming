import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio 35

    var n=0
    var max =10

    var nRandom :Int
    var contador=0
    var n1: Int = 0
    while ((n1<=0 || n1>=50))
    {
        println("Por favor ingresa el primer numero que comprenda entre 1 y 49")
        n1 = readln().toInt()

    }
    var n2: Int = 0

    while ((n2<=0 || n2>=50))
    {
        println("Por favor ingresa el segundo numero que comprenda entre 1 y 49")
        n2 = readln().toInt()

    }


    while (n<max)
    {
        nRandom = Random.nextInt(1,49)
        println("El numero ${n+1} es $nRandom")
        n++

        if(nRandom==n1 ||nRandom==n2)
        {
            println("El numero $nRandom ha coincidido con uno de los tuyos !")
            contador++
        }
    }
    if(contador==1) println("Has ganado 50€")
    else if (contador==2) println("Has ganado 100€")
    else if(contador>=3) println("¡Has ganado la loteria!")
    else println("No has ganado nada")
}