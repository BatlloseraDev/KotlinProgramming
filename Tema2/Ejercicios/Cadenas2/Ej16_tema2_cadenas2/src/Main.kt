fun main() {

    var texto = "Daniel Lobato"
    var textoMorse = ""
    val CODIGO = arrayOf(
        arrayOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","1","2",
        "1","2","3","4","5","6","7","8","9","0"),
        arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",".----","..---","...--","....-",
            ".....","-....","--...","---..","----.","-----")
    )

    for(i in texto.indices)
    {
        textoMorse+= DevolverMorse(texto[i],CODIGO)
    }
    println(textoMorse)
}


fun DevolverMorse(caracter: Char,cod :Array<Array<String>> ): String
{
    var devolver = ""
    if(caracter.code!=32)
    {
        for(i in cod[0].indices)
        {

            if(cod[0][i] == caracter.toString().lowercase())
            {
                devolver= cod[1][i]+" "
            }
        }
    }
    else
        devolver = "  "


    return devolver
}
