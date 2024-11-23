fun main(args: Array<String>) {
    var anio : Int = 0

    anio = pedirAnio()

    if (esBisiesto(anio)){
        println("El ${anio} es bisiesto")
    }
    else{
        println("El ${anio} no es bisiesto")
    }
}
fun pedirAnio(): Int {
    var x: Int? = null
    do {
        println("Introduce el año:")
        x = readln().toIntOrNull()
    }while(x == null)
    return x
}

fun esBisiesto(anio:Int):Boolean{
    return (anio%4==0 && anio%100!=0 || anio%400==0)
}