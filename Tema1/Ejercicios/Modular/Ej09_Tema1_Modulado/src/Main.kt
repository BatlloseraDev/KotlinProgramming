fun main() {

    var n = DevolverInt("Ingresa un numero para determinar cuantas cifras que hay")
    println("El numero tiene ${CalcularCifras(n)} cifras")

}



fun CalcularCifras(num:Int) :Int
{
    var contador= 0
    var n = num

    while ((n > 0 || n < 0 )) {
        n /= 10
        contador++
    }

    return contador
}



fun DevolverInt(num:String):Int
{
    var  n :Int? = null
    while (n==null)
    {

        println(num)
        n= DevolverIntONull(readln())
    }
    return n
}

fun DevolverIntONull(input: String):Int? {
    return try {
        input.toInt()
    } catch (e: NumberFormatException) {
        println("Numero no reconocido o no valido, por favor ingresa un entero")
        null
    }
}