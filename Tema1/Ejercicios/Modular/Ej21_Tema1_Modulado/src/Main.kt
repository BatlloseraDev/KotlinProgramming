fun main() {

    var nb = DevolverLong("Por favor ingresa un numero en binario")
    var opc:Int?= null
    do{

        opc= DevolverInt("¿Que desea hacer?" +
                "\n1. Convertirlo a decimal" +
                "\n2. Convertirlo a octal" +
                "\n3. Convertirlo a hexadecimal" +
                "\n4. Cambiar el numero binario"+
                "\n0. Salir del programa")
        when(opc)
        {
            0-> println("Saliendo del programa")
            1-> println("El numero en decimal es ${ConvertirADecimal(nb)}") //pasar a decimal

            2-> println("El numero en octal es ${ConvertirAOctal(nb)}")// pasar a octal

            3->println("El numero en hexadecimal es ${ConvertirAHexadecimal(nb)}")//pasar a hexadecimal

            4-> nb=DevolverLong("Por favor ingresa un numero en binario")

            else -> println("opcion no valida")
        }
    }while (opc!=0)

}

fun ConvertirADecimal(num: Long):Long
{
    var numeroDecimal = 0L
    var power = 0
    var numeroBinario= num
    while(numeroBinario>0)
    {
        var temp = numeroBinario%10

        numeroDecimal+= (temp*Math.pow(2.0,power.toDouble())).toLong()
        numeroBinario /=10
        power++
    }
    return numeroDecimal
}

fun ConvertirAOctal(num: Long): Long
{
    var power= 0
    var numero= 0
    var octal=""
    var numeroBinario= num
    while(numeroBinario>0)
    {
        var temp = numeroBinario%10
        numero+=(temp*Math.pow(2.0,power.toDouble())).toInt()
        numeroBinario /=10
        power++
        if (power==3)
        {
            octal+="$numero"
            numero = 0
            power = 0
        }
    }
    if(numero !=0) octal+="$numero"

    return octal.reversed().toLong()
}

fun ConvertirAHexadecimal(num:Long): String
{
    var power= 0
    var numero= 0
    var hexadecimal=""
    var numeroBinario= num
    while(numeroBinario>0)
    {
        var temp = numeroBinario%10
        numero+=(temp*Math.pow(2.0,power.toDouble())).toInt()
        numeroBinario /=10
        power++
        if (power==4) {
            hexadecimal += DevolverAnotacionHexa(numero)
            numero = 0
            power = 0
        }
    }
    if(numero!=0)hexadecimal+=DevolverAnotacionHexa(numero)

    return hexadecimal.reversed()
}


fun DevolverAnotacionHexa(num :Int) : String
{
    var numeroLetra = ""
    when(num)
    {
        0,1,2,3,4,5,6,7,8,9 -> numeroLetra+=num
        10->numeroLetra+="A"
        11->numeroLetra+="B"
        12->numeroLetra+="C"
        13->numeroLetra+="D"
        14->numeroLetra+="E"
        15->numeroLetra+="F"
        else-> println("Hubo un error ")
    }
    return numeroLetra
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




fun DevolverLong(texto:String):Long
{
    var  n :Long? = null
    while (n==null)
    {
        println(texto)
        n= DevolverLongONull(readln())
    }
    return n
}

fun DevolverLongONull(input: String):Long? {
    return try {
        input.toLong()
    } catch (e: NumberFormatException) {
        println("Numero no reconocido o no valido, por favor ingresa una entrada valida")
        null
    }
}