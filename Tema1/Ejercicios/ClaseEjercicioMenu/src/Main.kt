fun main() {

    var opcion:Int = 0
    var seguir= true
    while (seguir)
    {
        do{
            println("Selecciona una opcion")
            println("1. -Sumar")
            println("2. -Restar")
            println("3. -Terminar")
            opcion = readln().toInt()
        }while ((opcion<1)||(opcion>3))
        if(opcion==1)
        {
            println("Ingresa numero 1")
            var n1 = readln().toInt()
            println("Ingresa numero 2")
            var n2= readln().toInt()

            println("El resultado de sumar los dos numeros es ${n1+n2}")
        }
        if (opcion==2)
        {
            println("Ingresa numero 1")
            var n1 = readln().toInt()
            println("Ingresa numero 2")
            var n2= readln().toInt()

            println("El resultado de restar los dos numeros es ${n1-n2}")
        }
        if(opcion==3)
        {
            println("Saliendo del programa")
            seguir = false
        }

    }


}