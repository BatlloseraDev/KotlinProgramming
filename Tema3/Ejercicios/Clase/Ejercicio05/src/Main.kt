fun main() {
    //ejercicios de clase de folio
    //ejercicio3

    var frase = "Fiesta de los Santos"
    var letra = readln()[0]
    PrintPos(letra,frase)
}


fun PrintPos(letra :Char, cadena:String)
{
    if(cadena.contains(letra))
    {
        var pos = cadena.indexOf(letra)
        println("Una posicion es $pos")
        PrintPos(letra,cadena.substring(pos+1,cadena.length-1))
    }
}
