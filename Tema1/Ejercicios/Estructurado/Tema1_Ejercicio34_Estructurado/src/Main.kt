//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Ejercicio 34
    var n = 100
    var i = 1 //corredor
    var j= 1 // segundo corredor
    var contadorDivisores = 0

    while (i<=n)
    {
        while(j<=i)
        {
            if(i%j==0)
            {
                contadorDivisores++

            }
            j++
        }

        if(contadorDivisores<=2)
        {
            println("El numero $i es primo")
        }
        contadorDivisores= 0
        j=1
        i++
    }

}