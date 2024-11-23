fun main(args: Array<String>) {
    var numero = 0
    var contador = 0
    var suma = 0
    println("Dame la cantidad de numeros a introducir")
    var N= readln().toInt()

    do{
       println("dame un numero")
       numero = readln().toInt()
       suma =suma + numero // suma += numero
       contador++
    }while(contador<N)

    println("La media es ${suma/N}")
}