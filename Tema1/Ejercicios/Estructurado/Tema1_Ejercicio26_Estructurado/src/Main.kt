//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var terminar= false
    while (!terminar)
    {
        println("¿Desea terminar (s/n)?")
        var t= readln()
        t = t.lowercase()
        if(t=="s")
        {
            println("Gracias por su visita")
            terminar= true
        }

    }

}