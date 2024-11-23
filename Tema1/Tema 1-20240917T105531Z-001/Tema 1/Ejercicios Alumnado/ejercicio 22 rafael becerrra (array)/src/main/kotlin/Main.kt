import kotlin.math.abs

fun main() {
    val numero1:Int = pedirNumero()
    //   ParImpar(numero1)
    ParImparString(numero1)

}
fun pedirNumero():Int{
    print("Introduce un numero: ")
    return readln().toInt()
}


fun ParImparString(numero:Int) {
    var numeroString = numero.toString()
    var pares = 0
    var impares = 0
    var contador = 0
    while (contador < numeroString.length) {
        val cifra = numeroString[contador].toString().toInt()
        if (cifra % 2 == 0) {
            pares++
        } else {
            impares++
        }
        contador++
    }
    return println("El numero $numero tiene $pares pares y $impares impares")

}


/*
fun ParImpar(numero:Int){
    var numero2 = abs(numero)
    var contador = numero2
    var pares = 0
    var impares = 0
        while (contador != 0){
            if (contador%2 == 0){
                pares ++
            }
            else{
                impares ++
            }
            contador/=10

        }
    return println("El numero $numero tiene $pares pares y $impares impares")
}


 */