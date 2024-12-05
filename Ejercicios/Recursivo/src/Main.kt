


fun main() {


    var n = 5
    /*while(n>=0)
    {
        println(n)
        n--
    }*/
    recursivo(n)

}


fun recursivo(n:Int)
{
    if(n==0)
    {
        println("fin")
    }
    else
    {

        recursivo(n-1)
    }
    println(n)
}