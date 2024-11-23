//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var entreNumeros = false
    while (!entreNumeros)
    {
        println("Ingresa un numero")
        var n = readln().toInt()
        if(n>=1 && n<= 5)
        {
            println("El numero $n esta entre 1 y 5 ")
            entreNumeros=true
        }
    }

}