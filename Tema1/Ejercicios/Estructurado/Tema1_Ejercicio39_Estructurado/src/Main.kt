import kotlin.random.Random

fun main() {

    //Ejercicio 39
    var seguir =true
    var contador = 0
    var victoria = false


    while(seguir)
    {
        var r = Random.nextInt(1,101)

        while (contador<5 && !victoria)
        {
            println("Ingresa un numero")
            var n = readln().toInt()
            if(n==r)
            {
                println("has ganado")
                victoria=true
            }
            else if(n>r)
            {
                println("has fallado \nel numero es menor")

            }
            else
            {
                println("has fallado\nel numero es mayor")
            }
            contador++
        }
        if(contador>=5 && !victoria)
        {
            println("Has perdido, el numero era $r")
        }


        println("¿Desea voler a jugar (s/n)?")
        var sn= readln()
        sn= sn.lowercase()
        if(sn=="n")
        {
            println("Saliendo del programa")
            seguir=false
        }
        contador=0;
        victoria= false

    }




}