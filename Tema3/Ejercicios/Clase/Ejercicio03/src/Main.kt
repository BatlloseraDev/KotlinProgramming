fun main() {

    //ejercicios de clase de folio
    //ejercicio1

    var frase = "Fiesta de los Santos"
    var n1 = -1
    var n2= -1
    do
    {
        println("Ingresa el principio de la cadena que quieres cortar")
        n1= readln().toInt()
        println("Ingresa el final de la cadena que quieres cortar")
        n2= readln().toInt()
        if(DevolverCondicion(n1,n2,frase)) println("Error en los datos introducidos vuelve a intentarlo")
    }while (DevolverCondicion(n1,n2,frase))


    println(frase.substring(n1,n2))
}

fun DevolverCondicion(numero1:Int, numero2:Int, frase:String):Boolean
{
    var longitud = frase.length-1
    var repetir = true
    if((numero1<numero2)&&(numero1>=0)&&(numero2<=longitud)) repetir= false

    return repetir
}