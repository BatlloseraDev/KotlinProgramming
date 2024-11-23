import jdk.incubator.vector.Vector
import kotlin.random.Random

fun main() {

    var v1 = RellenarArray(3,true, -9,10)
    var v2 = RellenarArray(3, true, -9,10)
    var sumatorio = sumarVectores(v1,v2)
}

fun sumarVectores(vector1: Array<Int>, vector2:Array<Int>): Array<Int>
{
    var tamanio= 0
    if(vector1.size >vector2.size) tamanio= vector1.size
    else tamanio= vector2.size
    var sum: Array<Int> = Array(tamanio){0}
    for (i in sum.indices)
    {
        sum[i] = vector1[i]+vector2[i]
    }
    return sum
}


fun RellenarArray(tamanio : Int, auto:Boolean, minimoRandom: Int,maximoRandom:Int): Array<Int>
{
    var array: Array<Int> = Array(tamanio){0}

    for(i in array.indices)
    {
        if(auto)
        {
            array[i]= Random.nextInt(0,11)
            print("${array[i]} ")
        }
        else
        {
            println("Escribe numero para la posicion ${i+1}")
            array[i]= readln().toInt()
        }
    }

    return array
}