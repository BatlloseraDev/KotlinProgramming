import kotlin.math.roundToInt
import kotlin.random.Random

/*Ejercicio 1*/
val TAMANIO= 10

fun main() {

    var vectorEj = Array<Float>(TAMANIO){ devolverFloat(100)}


    var seguir= true
    while(seguir)
    {
        imprimirArray(vectorEj);
        var opc= 0
        do {
                opc = ControlErrores.pedirPorTecladoInt(
                "Ingresa que quieres hacer:\n(1).-Insertar\n(2).-Borrar\n(3).-Salir",
                "Dato Introducido no es un int"
            )
            if(opc<1||opc>3)
            {
                println("Dato no valido")
            }
        }while(opc<1 || opc>3)

        when(opc)
        {
            1-> {
                var randomFloatTemporal = devolverFloat(100)
                println("Se ha generado aleatoriamente ${randomFloatTemporal}")
                var lugar= seleccionarPos("Ingresa en que posición de la array quieres ingresarlo\n(pista: las posiciones van del 0 al ${TAMANIO - 1})")
                insertarNumero(randomFloatTemporal,lugar,vectorEj)

            }
            2->{
                var lugar= seleccionarPos("Ingresa en que posición de la array quieres borrar\n(pista: las posiciones van del 0 al ${TAMANIO - 1})")
                eliminarNumero(lugar,vectorEj)
            }
            3->{
                seguir=false
            }
        }

    }
}


fun seleccionarPos(texto:String): Int
{
    var lugar= -1
    do{
        lugar= ControlErrores.pedirPorTecladoInt(texto,"Dato no valido ingresa un numero")
        if(lugar<0 || lugar>TAMANIO-1)
        {
            println("Posición no valida")
        }
    }while (lugar<0 || lugar>TAMANIO-1)
    return lugar
}

fun eliminarNumero(lugar: Int, aF: Array<Float>)
{
    var aux= 0f
    var aux2=0f
    var pos= TAMANIO-1
    var llego= false
    while(pos>=0)
    {
        if(!llego)
        {
            aux= aF[pos]
            aF[pos]= aux2
            aux2= aux
        }
        if(pos==lugar)
        {
            llego= true
        }

        pos--
    }
}


fun insertarNumero(f:Float, pos:Int, aF: Array<Float>)
{
    var aux = 0f
    var aux2 = f
    var llego= false
    for(i in aF.indices){
        if(i==pos)llego= true
        if(llego)
        {
            aux= aF[i]
            aF[i]= aux2
            aux2= aux
        }
    }

}



fun imprimirArray(aF: Array<Float>){
    for(i in aF.indices)
    {
        print("${aF[i]}|");
    }
    println()
}


fun devolverFloat(n:Int):Float
{
    var randomFloat = Random.nextFloat()*n+1
    randomFloat = (randomFloat*100f).roundToInt() / 100f
    return randomFloat
}

