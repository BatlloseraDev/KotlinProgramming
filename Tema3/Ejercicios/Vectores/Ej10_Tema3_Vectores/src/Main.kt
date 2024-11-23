import kotlin.random.Random

fun main() {
    println("Hello World!")
    var numerosLoteria: Array<Int> = Array (6){0}


    for(i in numerosLoteria.indices)
    {
        numerosLoteria[i] = GenerarNum(numerosLoteria)

        println("Numero de la posicion $i es ${numerosLoteria[i]}")
    }



}




fun GenerarNum(array: Array<Int>):Int
{
    var numeroIgual= false
    var bucle = true
    var numAleatorio = 0
    while (bucle)
    {
        numAleatorio = Random.nextInt(1,50)

        for(i in array.indices)
        {
            if(array[i]==numAleatorio)
            {
                numeroIgual= true
            }
        }
        if(!numeroIgual)
        {
            bucle = false
        }
    }

    return numAleatorio
}