//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio22
    println("Primero sumare todos los numeros imapres que hay del 1 al 20")
    var n=1
    var sum= 0
    while (n<=20)
    {
        if(n%2!=0)
        {
            sum+=n
        }
        n++
    }
    println("El sumatorio de todos los numeros impares es $sum" +
            "\nAhroa puedes ingresar dos numeros para saber cuantos impares hay en ellos" +
            "\nIngresa el primer numero")
    var n1= readln().toInt()
    println("Ingresa el segundo numero")
    var n2= readln().toInt()

    if(n1>n2)
    {
        var nAux=n1
        n1= n2
        n2=nAux
    }
    sum=0
    while (n1<=n2)
    {
        if(n1%2!=0)
        {
            sum+=n1
        }
        n1++
    }
    println("El el sumatorio de numeros impares entre los numeros dados es $sum")




}