//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Ingresa un numero para saber todos sus divisores")
    var n = readln().toInt()
    var cadena :String = ""
    var contador = 1
    while (contador<n)
    {
        if(n%contador==0)
        {
            cadena+= "$contador, "
        }
        contador++

    }

    println("El numero $n tiene los siguientes divisores: $cadena")


}