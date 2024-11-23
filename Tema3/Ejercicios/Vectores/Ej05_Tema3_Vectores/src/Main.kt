import kotlin.random.Random

fun main() {

    var vectorAleatorios: Array<Int> = Array(10){0}
    DevolverArrayConNumAleatorio(vectorAleatorios,-100,101)

    println(" ${ContarMaximosYMinimos(vectorAleatorios)}")


}

fun ContarMaximosYMinimos(array: Array<Int>):String
{
    var pos= 0
    var numPos=0
    var numMin= 0
    for(i in array.indices)
    {
        if(array[i]>=0)
        {
            numPos++
        }
        else
        {
            numMin++
        }
    }


    return "Los numeros positivos son $numPos y los numeros negativos son $numMin"
}



fun DevolverArrayConNumAleatorio(array: Array<Int>,numMinimo:Int,numMaximo:Int)
{
    for(i in array.indices)
    {
        array[i] = Random.nextInt(numMinimo,numMaximo)
        println("para la pos $i he guardado ${array[i]}")
    }
}