import kotlin.math.roundToInt

fun main(args: Array<String>) {
    var num1 : Int = 0
    var num2 : Int = 0
    var num3 : Int = 0
    var media : Float = 0f
    var media_redondeada : Int= 0

    print("Dame 3 números: ")
    num1= readln().toInt()
    num2= readln().toInt()
    num3= readln().toInt()

    media= (num1+num2+num3)/3f
    media_redondeada = Math.round(media)
    //media.roundToInt()
    print("La media es: ")
    println(media)
    print("La media redondeada es: ")
    println(media_redondeada)
}