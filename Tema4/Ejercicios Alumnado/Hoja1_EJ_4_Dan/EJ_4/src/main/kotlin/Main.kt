fun main() {
    val garfield : Gato = Gato("Garfield","naranja","exótico",8,"macho",18)
    val tom : Gato = Gato("Tom","gris","siamés",10,"macho",12)
    val lisa : Gato = Gato("Lisa","blanco","persa",5,"hembra",10)
    val pepito = Gato("Garfield","marrón","siamés",7,"hembra",11)

    println("------\nGarfield come pescado:")
    garfield.maullar()
    garfield.ronronear()
    garfield.comer("pescado")
    garfield.pelear(tom)
    garfield.pelear(tom.sexo)

    println("------\nTom come sopa:")
    tom.maullar()
    tom.ronronear()
    tom.comer("sopa")
    tom.pelear(pepito)

    println("------\nLisa come carne:")
    lisa.maullar()
    lisa.ronronear()
    lisa.comer("carne")
    lisa.pelear(garfield)
}