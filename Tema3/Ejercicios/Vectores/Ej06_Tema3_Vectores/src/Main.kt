import kotlin.random.Random

fun main() {
    var arrayNumerosAleatorios: Array<Int> = Array(100){ Random.nextInt(1,101) }
    var n= DevolverInt("Ingresa el numero que quieres comprobar cuantas veces sale")

    println("El numero $n sale ${contador(arrayNumerosAleatorios,n)} veces en el array de tamaño ${arrayNumerosAleatorios.size}")


}

fun contador(array: Array<Int>, n: Int): Int
{
    var contador = 0

    for(i in array.indices)
    {
        if(array[i]==n) contador++
    }

    return contador
}


fun DevolverInt(texto:String):Int
{
    var  n :Int? = null
    while (n==null)
    {
        println(texto)
        n= DevolverIntONull(readln())
    }
    return n
}

fun DevolverIntONull(input: String):Int? {
    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        println("Numero no reconocido o no valido, por favor ingresa una entrada valida")
        null
    }
}