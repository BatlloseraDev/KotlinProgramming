fun main() {


    if(CalcularPrimo(DevolverInt("Introduce un numero para saber si es primo")))
        println("El numero introducido es primo")
    else println("El numero no es primo")
}



fun CalcularPrimo(numero: Int): Boolean
{
   var bool = false
   var contador = 0
   for(i in 1.. numero step  1)
   {
       if(numero%i==0)contador++
   }
    if(contador<=2) bool= true

    return bool
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
        println("Numero no reconocido o no valido, por favor ingresa un entero")
        null
    }
}
