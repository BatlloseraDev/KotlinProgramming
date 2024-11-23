fun main() {

    var h = DevolverInt("Ingresa la hora")
    var m = DevolverInt("Ingresa los minutos")
    var s = DevolverInt("Ingresa los segundos")

    s++

    if(ComprobarMinutosSegundos(s))
    {
        m += s/60
        s%=60
    }
    if(ComprobarMinutosSegundos(m))
    {
        h += m/60
        m%=60
    }
    if(comprobarHora(h))
    {
        h%=24
    }
    println("La hora sumada un segundo es ${String.format("%02d",h)}:${String.format("%02d",m)},${String.format("%02d",s)} ")

}


fun ComprobarMinutosSegundos(cantidad: Int):Boolean
{
    var bool= false
    if(cantidad>=60) bool=true
    return bool
}

fun comprobarHora(cantidad: Int) :Boolean
{
    var bool= false
    if(cantidad>=24) bool = true
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