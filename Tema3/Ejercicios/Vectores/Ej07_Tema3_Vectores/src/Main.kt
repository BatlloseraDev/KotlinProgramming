import kotlin.random.Random

fun main() {
    var arrayNumerosAleatorios: Array<Int> = Array(100){ Random.nextInt(1,101) }
    var n= DevolverInt("Ingresa el numero que quieres comprobar cuantas veces sale")

    if(devolerPos(arrayNumerosAleatorios,n)!=-1)
    println("El numero $n sale en la pos ${devolerPos(arrayNumerosAleatorios,n)} por primera vez del array de tamaño ${arrayNumerosAleatorios.size}")
    else println("No se encuentra en el array")

}

fun devolerPos(array: Array<Int>, n: Int): Int
{
    var pos = array.indexOf(n)

    return pos
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