//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("¿Que forma quieres elegir?\n(1).Cuadradado\n(2).Rectangulo\n(3).Circulo")
    var figuraElegida = readln().toInt()
    if(figuraElegida==1) {

        //Ejercicio 1
        println("Ejercicio 1")
        println("\nPara calcular la superficie y el perimetro de un cuadrado ingrese el valor de su lado")
        var ladoCuadrado = readln().toInt()
        var area = ladoCuadrado * ladoCuadrado
        var perimetro = 4 * ladoCuadrado
        println("La superficie es $area y el perimetro es $perimetro \n \n")
    }
    else if(figuraElegida==2) {

        //Ejercicio 2
        println("Ejercicio 2")
        println(
            "\nPara calcular la superficie y perimetro de un rectagulo tendras que ingresar los siguientes datos:\n " +
                    "Ingrese el valor de la base"
        )
        var baseRectagulo = readln().toInt()
        println("Ingrese el valor de la altura")
        var alturaRectangulo = readln().toInt()

        var areaRectangulo = baseRectagulo * alturaRectangulo
        var perimetroRectangulo = (2 * baseRectagulo) + (2 * alturaRectangulo)

        println("El valor del area del rectagulo es $areaRectangulo y el perimetro es $perimetroRectangulo \n \n")
    }
    else if(figuraElegida==3) {
        //Ejercicio 3
        println("Ejercicio 3")
        println(
            "\nPara calcular el area y la circunferencia de un circulo proporciona el radio del mismo:\n" +
                    "Ingresa el valor del radio"
        )
        var radioDelCirculo = readln().toInt()

        var areaDelCirculo = radioDelCirculo * radioDelCirculo * Math.PI
        var circunferenciaDelCirculo = radioDelCirculo * 2 * Math.PI

        println("\nEl valor del area del circulo es $areaDelCirculo y la circuferencia del circulo es $circunferenciaDelCirculo \n \n")
    }else
    {
        println("Opcion escogida incorrecta")
    }

    //Ejercicio 4
    println("Ejercicio 4")
    println("\nPara calcular la media de los numeros, \n ingresa de cuantos numeros quieres hacer la media")
    var cantidad = readln().toFloat()
    var veces = 0
    var suma= 0
    while(veces<cantidad)
    {
        println("Dame el numero ${veces+1}")
        var n1 = readln().toInt()
        suma += n1
        veces++
    }
    var media:Float= suma/cantidad

    println("El resultado de la media es $media y redondeado seria ${Math.round(media)}")
    /*
    println("Ingresa el primer numero")
    var numero1media = readln().toInt()
    println("Ingresa el segundo numero")
    var numero2media = readln().toInt()
    println("Ingresa el tercer numero")
    var numero3media = readln().toInt()


    var mediaDeLosNumeros:Float = ((numero3media + numero1media +numero2media)/3f)
    var mediaRedondeada: Int = Math.round(mediaDeLosNumeros)
    println("La media de los números $mediaDeLosNumeros y la media de los numeros redondeados es" +
            " $mediaRedondeada \n\n")*/

    //Ejercicio 5
    println("Ejercicio 5")
    println("\nIngresa un numero para ver si es positivo o negativo:\n" +
            "Ingresa el numero")
    var comprobarPositivoNegativo= readln().toInt()

    if (comprobarPositivoNegativo<0)
    {
        println("El numero $comprobarPositivoNegativo es negativo")
    }
    else
    {
        println("El numero $comprobarPositivoNegativo es positivo")
    }

    println("Fin de los 5 ejercicios")






}