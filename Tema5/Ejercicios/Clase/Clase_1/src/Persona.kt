abstract class Persona(val firstName:String, val lastName: String) {

    abstract fun fullName():String
}

class Hombre(firstName: String,lastName: String):Persona(firstName,lastName)
{
    override fun fullName():String
    {
        return "Es un Hombre:"+lastName+" "+firstName
    }

}

class Mujer(firstName: String,lastName: String):Persona(firstName,lastName)
{
    override fun fullName():String
    {
        return "Es una Mentirosa:"+lastName+" "+firstName
    }

}