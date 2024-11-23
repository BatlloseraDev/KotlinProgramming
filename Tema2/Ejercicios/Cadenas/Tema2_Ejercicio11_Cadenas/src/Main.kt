import java.lang.constant.DynamicCallSiteDesc

fun main() {

    var cadena= PedirCadena("Porfavor ingresa un numero para transformarlo a int")
    var num= 0
    if(ComprobarNumero(cadena))
    {
        num=cadena.toInt()
        println("Tiene numero correcto por lo que en int seria $num")
    }
    else
    {
        println("No hay numeros correctos")
    }

}

fun ComprobarNumero(cadena:String):Boolean
{
    var tieneNumero= true
    for(i in cadena)
    {
        if(tieneNumero)
        {
            when(i)
            {
                '1','2','3','4','5','6','7','8','9','0' -> tieneNumero= true
                else -> tieneNumero=false
            }
        }

    }

    return tieneNumero
}



fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}

