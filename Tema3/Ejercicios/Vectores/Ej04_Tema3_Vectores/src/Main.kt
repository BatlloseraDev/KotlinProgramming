import kotlin.random.Random

fun main() {

    var vectorAleatorios: Array<Int> = Array(10){0}
    DevolverArrayConNumAleatorio(vectorAleatorios)
    var pos= posicionValorMaximo(vectorAleatorios)
    println("La posicion del numero maximo esta en $pos y el valor es ${vectorAleatorios[pos]} ")


}

fun posicionValorMaximo(array: Array<Int>):Int
{
    var pos= 0
    var numMax=0
    for(i in array.indices)
    {
        if(array[i]>=numMax)
        {
            numMax=array[i]
            pos=i
        }
    }


    return pos
}



fun DevolverArrayConNumAleatorio(array: Array<Int>)
{
    for(i in array.indices)
    {
        array[i] = Random.nextInt(0,100)
        println("para la pos $i he guardado ${array[i]}")
    }
}