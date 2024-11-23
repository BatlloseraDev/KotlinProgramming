//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var seguir = true

    while (seguir)
    {

        println("Ingresa dos numeros\nEl primero:")
        var n1= readln().toInt()
        println("El segundo")
        var n2 = readln().toInt()
        println("Por favor selecciona que quieres realizar" +
                "\n(1) sumar\n(2) restar\n(3) multiplicar\n(4) dividir")
        var opc = readln().toInt()
        when(opc)
        {
            1->{//sumar
                println("La suma es ${n1+n2}")
            }
            2->{//restar
                println("La resta es ${n1-n2}")
            }
            3->{//multiplicar
                println("La multiplicacion es ${n1*n2}")
            }
            4->{//dividir
                if(n2==0)
                {
                    println("No se puede dividir entre 0")
                }
                else println("La division es ${n1/n2}")
            }
            else ->
                {
                    println("Opcion no valida")
                }
        }

        println("¿Desea seguir (s/n)?")
        var sn= readln()
        sn= sn.lowercase()
        if(sn=="n")
        {
            println("Saliendo del programa")
            seguir=false
        }

    }






}