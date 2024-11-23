fun main() {

    var dAct= DevolverInt("Introduce el dia actual")
    var mAct= DevolverInt("Introduce el mes actual")
    var aAct= DevolverInt("Introduce el año actual")

println("Ahora los datos de la persona")
    var dNac= DevolverInt("Introduce el dia que nació")
    var mNac= DevolverInt("Introduce el mes que nació")
    var aNac= DevolverInt("Introduce el año que nació")

    var anioMesDiaAct = DevolverFechasEnUnInt(dAct,mAct,aAct)
    var anioMesDiaNac = DevolverFechasEnUnInt(dNac,mNac,aNac)

    if(anioMesDiaAct-anioMesDiaNac<0)
    {
        println("no puede haber despues de la fecha actual")
    }
    else
    {
        println("La persona tiene ${ComprobarFechas(anioMesDiaNac,anioMesDiaAct)} años")
    }
}

fun ComprobarFechas(fechaNac:Int, fechaAct:Int): Int
{
    return ((fechaAct-fechaNac)/10000)
}

fun DevolverFechasEnUnInt(dia:Int,mes:Int,anio:Int):Int
{
    var anioMesDia = "${String.format("%04d",anio)}${String.format("%02d",mes)}${String.format("%02d",dia)}".toInt()

    return anioMesDia
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