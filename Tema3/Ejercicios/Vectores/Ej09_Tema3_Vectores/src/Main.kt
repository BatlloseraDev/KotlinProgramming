fun main() {
    println("Hello World!")

    var n = DevolverInt("Devuelveme un numero para comrpobar si es capicua").toString()
    var arrayCapicua : Array<Int> = Array(n.length){0}
    DevolverArryIniciada(arrayCapicua,n)
    if(DevolverCapicua(arrayCapicua))
    {
        println("El numero introducido es capicua")
    }
    else
    {
        println("El numero introducido NO es capicua")
    }

}
fun DevolverArryIniciada(array: Array<Int>, cadena: String)
{
    for(i in cadena.indices)
    {
        array[i]= cadena[i].toString().toInt()
    }
}


fun DevolverCapicua(array: Array<Int>):Boolean
{
    var esCapicua= true
    var sizeArray= array.size-1
    for(i in array.indices)
    {
        if(array[i]!= array[sizeArray-i])
        {
            esCapicua= false
        }
    }


    return esCapicua
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


