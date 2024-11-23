fun main(args: Array<String>) {
    var num:Int=0
    var num2:Int=0
    var acu:Int=0
    var suma:Int=0

    println("Escriba el número donde quieras empezar a sumar los impares")
    num= readln().toInt()
    println("Escriba el número donde quieras empezar a sumar los impares")
    num2= readln().toInt()
    do{
        num++
        if (num%2!=0) {
            suma=num
            acu=suma+acu
        }}
    while (num!=num2)
    println("El resultado de la suma es $acu")
}