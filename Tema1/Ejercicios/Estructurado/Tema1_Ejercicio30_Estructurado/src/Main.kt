//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var nMayor= 0
    println("Elige version (1) para version 1 y (2) para version 2")
    var v= readln().toInt()
    when(v)
    {
        1-> {
            println("¿Cuantos numeros quieres ingresar para que te devuelva cual es el mayor?")
            var n = readln().toInt()
            if(n>0)
            {
                var contador= 0
                while (contador<n)
                {
                    println("Ingresa el numero ${contador+1}")
                    var numeroIngresado = readln().toInt()
                    if(numeroIngresado>nMayor)
                    {
                        nMayor= numeroIngresado
                    }
                    contador++
                }
            }else println("Cantidad de numeros incorrecta")


        }
        2-> {
            var contador = 0
            var salir = false
            while (!salir)
            {
                println("Ingresa el numero ${contador+1}")
                var numeroIngresado = readln().toInt()
                if(numeroIngresado>nMayor)
                {
                    nMayor= numeroIngresado
                }
                contador++
                if(contador%5==0 && contador!=0)
                {
                    println("¿Desea terminar (s/n)?")
                    var sn = readln()
                    sn= sn.lowercase()
                    if(sn=="s")
                    {
                        println("Saliendo del programa")
                        salir=true
                    }
                    else println("Se continuara con el programa")
                }


            }
        }
        else -> {
            println("Version no disponible")
        }
    }

    println("El numero mayor ha sido $nMayor")

}