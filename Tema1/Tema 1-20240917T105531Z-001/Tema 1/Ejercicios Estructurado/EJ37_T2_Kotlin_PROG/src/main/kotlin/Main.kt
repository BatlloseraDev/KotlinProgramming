import kotlin.random.Random

fun main(args: Array<String>) {
    var boleto:Int=0
    var apuesta:Int=0
    var aciertos:Int=0
    var i:Int=0

    for (i in 1..15){
        boleto= Random.nextInt(1,4)
        apuesta= Random.nextInt(1,4)
        if(apuesta == boleto){
            aciertos++}
        println("Su apuesta es $apuesta y su boleto $boleto")
    }
    println("Los aciertos han sido $aciertos")
}