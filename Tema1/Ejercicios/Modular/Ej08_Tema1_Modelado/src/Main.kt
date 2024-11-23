fun main() {

    var n1= DevolverInt("1")
    var n2= DevolverInt("2")
    var n3= DevolverInt("3")

    if(Ordenados(n1,n2,n3)) println("Estan ordenados")
    else println("No estan ordenados")

//Procedimiento()
}



fun Procedimiento()
{
    //podria hacer un array para estos 3 numeros


    //otra forma con array

    /*
    var intArray= Array<Int>(3){0}
    for(i in intArray.indices)
    {
       intArray[i] = DevolverInt((i+1).toString())
    }


    if(OrdenadosArray(intArray)) println("Estan ordenados")
    else println("No estan ordenados")
     */


}



fun Ordenados(numero1: Int, numero2: Int, numero3: Int) : Boolean
{
    var condicion = false
    if(numero2==numero1+1 && numero3==numero2+1) condicion= true

    return condicion
}


fun OrdenadosArray(intArray: Array<Int>): Boolean
{
    var condicion = false
    if ((intArray[1]==intArray[0]+1 )&& intArray[2]==intArray[1]+1) condicion = true

    return condicion
}




fun DevolverInt(num:String):Int
{
    var  n :Int? = null
    while (n==null)
    {

        println("Introduce número " +num +" que sea entero")
        n= DevolverIntONull(readln())
    }
    return n
}

fun DevolverIntONull(input: String):Int?
{
    return try {
        input.toInt()
    }
    catch (e: NumberFormatException)
    {
        println("Numero no reconocido o no valido, por favor ingresa un entero")
        null
    }
}
