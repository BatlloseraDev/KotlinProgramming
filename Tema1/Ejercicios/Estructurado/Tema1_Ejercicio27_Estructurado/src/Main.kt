//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var mayor100 = false
    while (!mayor100)
    {
        println("Ingresa un numero")
        var n = readln().toInt()
        if(n>100)
        {
            mayor100=true
            println("El numero fue mas grande que 100, adios")
        }
    }
}