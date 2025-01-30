fun main(args: Array<String>) {
    var n = Nombre("Jorge", "Navas", "Notario")
    var x:Alumno = Alumno(n,18)

    var mar=Alumno(Nombre("Raul","Naharro", "Fernadez"), 19)

    var y:Int = 0
    var z=0

    x.presentarse()
    mar.presentarse()
    mar.nombre.nombre = "Maria"
    mar.edad = 18
    mar.presentarse()

}