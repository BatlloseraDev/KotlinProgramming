fun main() {

    var cadena = PedirCadena("Escribe una oración para ver que palabra es la mas grande")
    println("La palabra mas larga de la frase es ${ComprobarPalabraLarga(cadena)}")


}


fun ComprobarPalabraLarga(c: String) :String
{
    var longitudFrase= c.length-1
    var maxPalabras = 0
    var palabraLarga= ""
    var contador=0
    var palabra =""
    for(i in 0 ..longitudFrase step 1)
    {
        //println("Es un espacio ? ${c[i].code}")
        if(c[i].code ==32 || i ==longitudFrase)
        {
            if(i==longitudFrase)
            {
                contador++
                palabra+=c[i]
            }
            //espacio por lo tanto reset
            if(contador>maxPalabras)
            {
                palabraLarga=palabra
                maxPalabras= contador
            }

            contador=0
            palabra=""
        }
        else
        {
            contador++
            palabra+=c[i]
        }

    }
    return palabraLarga
}





fun PedirCadena(mensaje: String) :String
{
    println(mensaje)
    var c = readln()
    return c

}