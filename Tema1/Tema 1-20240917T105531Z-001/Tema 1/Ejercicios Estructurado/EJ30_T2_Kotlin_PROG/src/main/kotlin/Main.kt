fun main(args: Array<String>) {
    var num:Int=0
    var mayor:Int=0
    mayor = num
    println("A continuación se obtendrá el numero mayor de todos los que haya introducido. \nRecuerde que para ver el resultado tan solo tiene que poner un número negativo")
    do {
        println("Escriba un número")
        num = readln().toInt()

        if (num > mayor) {
            mayor = num
        }
    }while (num>0)
    println("El mayor número que ha puesto ha sido el:${mayor}")
}