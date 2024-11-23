//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var n = 0
    var sum =0f
    var cont = 0
    var negativo= false
    while (!negativo)
    {
        println("Ingresa un numero entero no negativo para calcular la media")
        n = readln().toInt()
        if (n<0)
        {
            println("El numero ingresado no puede ser negativo, se procedera a mostrar el sumatorio")
            negativo=true
        }
        else
        {
            sum+=n
            cont++
        }
    }

    println("El calculo final es de ${sum/cont}")

}