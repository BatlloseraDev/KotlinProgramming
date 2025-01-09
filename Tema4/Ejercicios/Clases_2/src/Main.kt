fun main() {

    var perro = Animal()
    var gato= Animal("pepe", "gato",25)
    var periquito= Animal("Juan")

    println(gato)
    perro.setNombre1("Manolo")
    println(perro.getNombre1())
    var victron = Persona()
    victron.colorPelo= "Canoso"
    victron.altura= 177
    println(victron.colorPelo)
}