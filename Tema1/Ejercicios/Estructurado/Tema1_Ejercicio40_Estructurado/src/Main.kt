fun main() {

    //Ejercicio40
    var seguir = true
    while (seguir)
    {
        println("¿Que ejercicio quieres realizar?" +
                "\n(1) El 23" +
                "\n(2) El 29" +
                "\n(3) El 31" +
                "\n(0) Salir del programa")
        var opc= readln().toInt()
        when(opc)
        {
            1->{
                println("Dame un numero entero para saber su factorial")
                var n = readln().toInt()
                var nAux= n
                var fact:Long = 1
                while (n>0)
                {
                    fact*=n;
                    n--
                }
                println("El factorial de $nAux es $fact")


            }
            2->{
                println("De cuantos alumnos quieres las notas")
                var n_Alumnos = readln().toInt()
                //quiero hacerlo con for
                var corredorArray= 0
                val alumnosArray = Array<Float>(n_Alumnos){0f}
                while (corredorArray<n_Alumnos)
                {
                    println("Escribe la nota del alumno ${corredorArray+1}")
                    var nota = readln().toFloat()
                    alumnosArray[corredorArray] = nota
                    corredorArray++
                }
                var aprobados = 0
                var suspensos = 0
                var sobresaliente= 0
                var notable = 0
                var bienes = 0

                alumnosArray.forEach {
                    if(it>=5f)
                    {
                        aprobados++
                    }
                    else
                    {
                        suspensos++
                    }
                    when(it.toInt())
                    {
                        9,10 -> sobresaliente++
                        7,8-> notable++
                        5,6-> bienes++

                    }
                }
                println("El numero de aprobados es $aprobados y el numero de suspensos es $suspensos \n" +
                        "Entre los aprobados hay $sobresaliente sobresaliente/s" +
                        ", hay $notable notable/s y" +
                        " hay $bienes bien/es")

            }
            3->{
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
            0->{
                println("Cerrando el programa, que tenga un buen dia")
                seguir= false

            }
            else->
            {
                println("Opcion no valida, por favor ingrese una opcion valida")
            }
        }

    }



}