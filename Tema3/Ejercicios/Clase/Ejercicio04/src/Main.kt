fun main() {
    //ejercicios de clase de folio
    //ejercicio2

    var frase2= "fiesta"
    var letra = readln()[0]
    var fraseFinal= ""
    for(i in frase2.indices)
    {
        if(frase2[i]==letra)
        {
            fraseFinal+=frase2[i].uppercase()
        }
        else
        {
            fraseFinal+=frase2[i]
        }
    }
    println(fraseFinal)
}