import kotlin.random.Random
fun main(args: Array<String>) {
    var numero = 0

    do{
        numero = ingresarNumero()
    }while(!numeroCorrecto(numero))

    println("¡El número $numero cumple todas las condiciones!")
    var inverso = inverso(numero)
    println(inverso)
    var aleatorio = Random.nextInt(10000, 99999)
    println(aleatorio)
    comparaNumeros(inverso, aleatorio)
}

fun ingresarNumero(): Int {
    var n:Int = 0
    do{
        println("Ingresa un número de cinco cifras entre 10000 y 99999:")
        n = readLine()?.toIntOrNull() ?: 0
    }while(n<10000 || n>99999)
    return n
}

fun numeroCorrecto(numero:Int): Boolean{

    var seguir = true
    var n5 = numero % 10
    var n4 = (numero / 10) % 10
    var n3 = (numero / 100) % 10
    var n2 = (numero / 1000) % 10
    var n1 = (numero / 10000) % 10

    if (n3 !=3 ) seguir=false
    if ((n1+n2+n3+n4+n5)%2!=0) seguir=false
    if (n1 != n5) seguir=false
    return seguir
}

fun inverso(numero:Int):Int{
    var n5 = (numero/1) % 10
    var n4 = (numero / 10) % 10
    var n3 = (numero / 100) % 10
    var n2 = (numero / 1000) % 10
    var n1 = (numero / 10000) % 10

    return n5 * 10000 + n4 * 1000 + n3 * 100 + n2 * 10 + n1
}
fun comparaNumeros(inverso:Int, aleatorio:Int){
    var digitoInverso = 0
    var digitoAleatorio = 0
    var divisor=1
    var n=0
    while (n<5){
        digitoInverso = (inverso/divisor) % 10
        digitoAleatorio = (aleatorio/divisor) % 10
        contar(digitoInverso,digitoAleatorio)
        divisor = divisor * 10
        n++
    }
}

fun contar(a:Int, b:Int){
    var mayor = a
    var min=b
    if (min > mayor){
        mayor = min
        min = a
    }
    while (min<=mayor){
        print(" $min")
        min++
    }
    println()
}