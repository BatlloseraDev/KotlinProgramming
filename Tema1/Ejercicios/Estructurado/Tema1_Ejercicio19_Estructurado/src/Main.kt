import kotlin.math.pow

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Ecuacion de segundo grado" +
            "\nIngresa el primer coeficiente")
    var a = readln().toFloat()
    println("Ingresa el segundo coeficiente")
    var b = readln().toFloat()
    println("Ingresa el tercer coeficiente")
    var c = readln().toFloat()

    var unaSolucion:Double= (b.pow(2))-(4.0*a*c)
    if(unaSolucion==0.0)
    {
        println("¡Tiene una solución!")
        var solucion= ((-b)/2*a)
        println("La solucion es $solucion")
    }
    else if (unaSolucion<0.0)
    {
       println("La ecuacion no tiene resolucion real")
    }
    else
    {
        println("¡Tiene dos soluciones!")
        var solucion1 = (((-b)+(Math.sqrt(unaSolucion)))/2*a)
        var solucion2 = (((-b)-(Math.sqrt(unaSolucion)))/2*a)
        println("La solucion 1 es $solucion1 y la solucion 2 es $solucion2")

    }



}