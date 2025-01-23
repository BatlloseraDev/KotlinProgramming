//class CatPersa : Cat() { // es final, sino se pone nada delante es final
class CatPersa : Dog(){
    override fun makeSound() {
        println("El perro Gato ladra y maulla")
    }
}