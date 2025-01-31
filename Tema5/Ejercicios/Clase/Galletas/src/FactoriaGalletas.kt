import kotlin.random.Random

class FactoriaGalletas {
    companion object{

        fun crearGalletaAleatoria(): GalletaBase
        {
            var n = Random.nextInt(1, 5)
            return when(n)
            {
                1-> crearGalletaRellena()
                2-> crearGalletaRellenaEspecial()
                3-> crearGalletaEspecial()
                else -> crearGalletaNormal()
            }

        }




        fun crearGalletaNormal() : GalletaBase
        {
            var sabor = generarSabor()
            var peso= Random.nextInt(0,100)//gramos
            var numI= Random.nextInt(1, 11)
            var ingredientes= ArrayList<ElementoElaboracion>()
            for(i in 1..numI){

                ingredientes.add(generarIngrediente())
            }

            return GalletaBase(sabor, peso,ingredientes)
        }
        fun crearGalletaEspecial(): GalletaEspecial
        {
            var g = GalletaEspecial()
            var nG = Random.nextInt(1,11)
            for(i in 1..nG)//porque esta creado de otras galletas
            {
                g.addGalletaBase(crearGalletaNormal())
            }
            g.formaGalleta = Forma.entries.random()
            g.sabor= generarSabor()
            g.peso= Random.nextInt(0,100)
            var nI = Random.nextInt(1,11)
            for(i in 1..nI)
            {
                g.addIngrediente(generarIngrediente())
            }
            return g
        }

        fun crearGalletaRellena(): GalletaRellena
        {
            var g =GalletaRellena(generarSabor(),Random.nextDouble(0.0, 100.0))
            var nI = Random.nextInt(1,11)
            for(i in 1..nI)
            {
                g.addIngrediente(generarIngrediente())
            }
            g.sabor= generarSabor()
            g.peso = Random.nextInt(0,100)
            return g
        }

        fun crearGalletaRellenaEspecial(): GalletaRellenaEspecial
        {
            var g = GalletaRellenaEspecial()
            g.cambiarConsumoAnimal(Random.nextBoolean())
            var nSE = Random.nextInt(1,11)
            for(i in 1..nSE)
            {
                g.addSaboresEsp(generarSaborEspecial())
            }
            g.sabor= generarSabor()
            g.saborRelleno= generarSabor()
            var nI = Random.nextInt(1,11)
            for(i in 1..nI)
            {
                g.addIngrediente(generarIngrediente())
            }
            g.peso = Random.nextInt(0,100) //tengo que crear los metodos para esto

            return g
        }

        private fun generarSabor(): Sabor
        {
            var nombre: String = sabores.entries.random().toString()
            var d: Double = Random.nextDouble(0.0, 100.0)
            var pC: Double = Random.nextDouble(0.0, 100.0)

            return Sabor(nombre, d, pC)
        }

        private fun generarIngrediente(): ElementoElaboracion
        {
            var nombre: String = Ingredientes1.entries.random().toString()
            var grasas: Double = Random.nextDouble(0.0, 100.0)
            var carbo: Double= Random.nextDouble(0.0, 100.0)
            var por: Double = Random.nextDouble(0.0, 100.0)

            return ElementoElaboracion(nombre, grasas, carbo, por)
        }

        private fun generarSaborEspecial(): Sabor
        {
            var nombre: String = SaboresEsp.values().random().toString()
            var d: Double = Random.nextDouble(0.0, 100.0)
            var pC: Double = Random.nextDouble(0.0, 100.0)

            return Sabor(nombre, d, pC)
        }



    }


}

enum class sabores
{
    chocolate, vainilla, zanahoria, platano, nata, limon, leche;
}


enum class Ingredientes1
{
    harina, sal, azucar, miel, chocolate, caramelo, coco, mantequilla, leche;
}
enum class SaboresEsp
{
    vacuno, pollo, salmon, atun, buey, pato
}