import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Ejercicio 36

    var n=0
    var max =15

    var nRandom :Int

    while (n<max)
    {
        nRandom = Random.nextInt(1,4)

        when(nRandom)
        {
            1-> println("El partido ${n+1} es $nRandom")
            2-> println("El partido ${n+1} es $nRandom")
            3-> println("El partido ${n+1} es X")
        }
        n++
    }
}