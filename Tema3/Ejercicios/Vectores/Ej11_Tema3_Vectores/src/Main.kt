import kotlin.random.Random

fun main() {

    var v= RellenarArray(20,true)
    var v2 = RellenarArray(3,false)
    if(ComprobarCadenas(v,v2))
    {
        println("La cadena 1 contiene la cadena 2")
    }
    else
    {
        println("No lo contiene")
    }


}

fun ComprobarCadenas(arrayGrande: Array<Int>,arrayPequnia: Array<Int>):Boolean
{
    var encontrado= false
    var i = 0
    var j = 0
    while (i<(arrayGrande.size - arrayPequnia.size ))
    {

        if(arrayGrande[i]==arrayPequnia[j] &&!encontrado)
        {
            var contenido= true
            while(j<arrayPequnia.size && contenido )
            {
                if(arrayGrande[i+j]!= arrayPequnia[j])
                {
                    contenido=false
                }
                j++
            }
            encontrado= contenido
            j=0
        }


        i++
    }


    return encontrado
}




fun RellenarArray(tamanio : Int, auto:Boolean): Array<Int>
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