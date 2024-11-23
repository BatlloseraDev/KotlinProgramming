import kotlin.random.Random

fun main(args: Array<String>) {

    readli
    var azar : Short = 0

    for (i in 1..6){
        azar = Random.nextInt(1,49).toShort()
        println(azar)
    }
}