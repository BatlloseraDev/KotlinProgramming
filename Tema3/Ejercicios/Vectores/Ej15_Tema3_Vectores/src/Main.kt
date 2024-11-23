import kotlin.random.Random

fun main() {

    var arrayParejas: Array<Int> = GenerarParejas(10);

}


fun GenerarParejas(tamanio:Int):Array<Int>
{
    var posiciones: String = ""
    var arrayCalculado = Array(tamanio){0}
    var cont = 0
    for (i in 0 ..<tamanio)
    {
        posiciones+= "${i}"
    }
    while(posiciones.isNotEmpty())
    {
        var contador= 0
        var numeroRandom=0
        while (numeroRandom==0 || arrayCalculado.contains(numeroRandom))
        {
            numeroRandom=Random.nextInt(1,100)
        }
        while (contador!=2)
        {
            var posrandom= Random.nextInt(0,posiciones.length)
            var valorInt: Int = posiciones[posrandom].toString().toInt()
            arrayCalculado[valorInt]=numeroRandom
            contador++
            posiciones = posiciones.replace(posiciones[posrandom].toString(),"")
        }

    }

    return arrayCalculado
}