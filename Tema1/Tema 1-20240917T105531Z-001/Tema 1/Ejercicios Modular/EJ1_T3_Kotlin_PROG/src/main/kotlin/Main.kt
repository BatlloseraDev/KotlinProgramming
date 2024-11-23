fun main() {
    var numero1: Int = pedir()
    var numero2: Int = pedir()

    //Si los dos numeros son positivos los suma
    if (esPositivo(numero1) && esPositivo(numero2)){
        println("La suma es ${numero1 + numero2}")
    }
    else{
        imprimeError(numero1, numero2)
    }
}

fun pedir():Int{
    println( "Dame el número:")
    return (readln().toInt())
}

fun esPositivo(n : Int):Boolean{
    return (n>0)
}

fun imprimeError(n1:Int, n2:Int){
    //ha realizar
}