fun main() {



    println("la cadena ordenada es ${OrdenarDeMayorAMenor(DevolverInt("Introduce el primer numero"),DevolverInt("Introduce el segundo numero"),
        DevolverInt("Introduce el tercer numero"))}")


}


fun OrdenarDeMayorAMenor(n1:Int, n2:Int,n3:Int): String
{
    var cadena = ""
    //quiero hacerlo con arrays...
    if(n3>n2 && n3>n1 )
    {
        cadena+="$n3"
        if(n2>n1)
        {
            cadena+=" $n2 $n1"
        }
        else cadena+=" $n1 $n2"
    }
    else if(n2>n1 && n1>n3)
    {
        cadena+="$n2 $n1 $n3 "
    }
    else
    {
        cadena+="$n1 $n2 $n3"
    }
    return cadena
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