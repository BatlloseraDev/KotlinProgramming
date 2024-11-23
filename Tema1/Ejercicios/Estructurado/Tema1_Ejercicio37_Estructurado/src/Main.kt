import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Ejercicio 36

    var n=0
    var max =15

    var nRandom :Int
    var nRandomResultado :Int
    var aciertos = 0


    while (n<max)
    {
        nRandom = Random.nextInt(1,4)
        nRandomResultado = Random.nextInt(1,4)
        when(nRandom)
        {
            1-> println("La apuesta del partido ${n+1} es $nRandom")
            2-> println("La apuesta del partido ${n+1} es $nRandom")
            3-> println("La apuesta del partido ${n+1} es X")
        }
        when(nRandomResultado)
        {
            1-> println("El resultado del partido ${n+1} es $nRandomResultado \n")
            2-> println("El resultado del partido ${n+1} es $nRandomResultado \n")
            3-> println("El resultado del partido ${n+1} es X \n")
        }
        if(nRandom==nRandomResultado)
        {
            aciertos++
        }

        n++
    }

    println("Has tenido $aciertos aciertos")
}