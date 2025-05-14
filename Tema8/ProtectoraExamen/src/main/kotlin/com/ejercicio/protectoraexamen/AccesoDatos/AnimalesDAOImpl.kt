package com.ejercicio.protectoraexamen.AccesoDatos

import com.ejercicio.protectoraexamen.Negocio.Animal
import com.ejercicio.protectoraexamen.Negocio.Gato
import com.ejercicio.protectoraexamen.Negocio.Perro
import com.ejercicio.protectoraexamen.Utilidades.ConexionBD
import com.ejercicio.protectoraexamen.Utilidades.SQL_Animal
import com.ejercicio.protectoraexamen.Utilidades.CONSTANTES
import com.ejercicio.protectoraexamen.Utilidades.CONSTANTES.DIR_FICHERO_SOLICITUDES
import java.io.File


class AnimalesDAOImpl: AnimalesDAO {


    //BASE DATOS
    private val conexionBD = ConexionBD()


    override fun getAnimalByID(id: Int): Animal? {
        conexionBD.conectar()
        val ps= conexionBD.getPreparedStatement(SQL_Animal.SELECT_BY_ID)
        ps?.setInt(1, id)
        val rs= ps?.executeQuery()
        var animal: Animal? = null
        if (rs?.next() != null) {
            if(rs.getString("Tipo")== CONSTANTES.PERRO) {
                animal = Perro(rs.getInt("ID"), rs.getString("Nombre"),rs.getString("Raza"),rs.getString("Sexo")=="Macho",rs.getInt("Edad"),
                    rs.getInt("Sociable")==1,rs.getInt("Apadrinado")==1, rs.getInt("PPP")==1,
                    rs.getInt("Leishmania")==1, rs.getDouble("Tamaño"))
            }
            else if(rs.getString("Tipo")== CONSTANTES.GATO){
                animal = Gato(rs.getInt("ID"), rs.getString("Nombre"),rs.getString("Sexo")=="Macho",rs.getInt("Edad"),
                    rs.getInt("Sociable")==1, rs.getInt("Apadrinado")==1, rs.getInt("Esterilizado")==1)
            }

        }
        ps?.close()
        conexionBD.desconectar()
        return animal
    }

    override fun getAnimalByNombre(nombre: String): Animal? {
        conexionBD.conectar()
        val ps = conexionBD.getPreparedStatement(SQL_Animal.SELECT_BY_NOMBRE)
        ps?.setString(1, nombre)
        val rs= ps?.executeQuery()
        var animal: Animal? = null
        if (rs?.next() != null) {
            if(rs.getString("Tipo")== CONSTANTES.PERRO) {
                animal = Perro(rs.getInt("ID"), rs.getString("Nombre"),rs.getString("Raza"),rs.getString("Sexo")=="Macho",rs.getInt("Edad"),
                    rs.getInt("Sociable")==1,rs.getInt("Apadrinado")==1, rs.getInt("PPP")==1,
                    rs.getInt("Leishmania")==1, rs.getDouble("Tamaño"))
            }
            else if(rs.getString("Tipo")== CONSTANTES.GATO){
                animal = Gato(rs.getInt("ID"), rs.getString("Nombre"),rs.getString("Sexo")=="Macho",rs.getInt("Edad"),
                    rs.getInt("Sociable")==1, rs.getInt("Apadrinado")==1, rs.getInt("Esterilizado")==1)
            }

        }
        ps?.close()
        conexionBD.desconectar()
        return animal
    }

    override fun getAllAnimales(): List<Animal> {
        conexionBD.conectar()
        val st = conexionBD.getStatement()
        val rs= st?.executeQuery(SQL_Animal.SELECT_ALL)
        val animales= mutableListOf<Animal>()
        while (rs?.next() ==true) {
            if(rs.getString("Tipo")== CONSTANTES.PERRO) {
                val animal = Perro(rs.getInt("ID"), rs.getString("Nombre"),rs.getString("Raza"),rs.getString("Sexo")=="Macho",rs.getInt("Edad"),
                    rs.getInt("Sociable")==1,rs.getInt("Apadrinado")==1, rs.getInt("PPP")==1,
                    rs.getInt("Leishmania")==1, rs.getDouble("Tamaño"))
                animales.add(animal)
            }
            else if(rs.getString("Tipo")== CONSTANTES.GATO){
                val animal = Gato(rs.getInt("ID"), rs.getString("Nombre"),rs.getString("Sexo")=="Macho",rs.getInt("Edad"),
                    rs.getInt("Sociable")==1, rs.getInt("Apadrinado")==1, rs.getInt("Esterilizado")==1)
                animales.add(animal)
            }
        }
        st?.close()
        conexionBD.desconectar()
        return animales
    }

    //FICHEROS
    var nombreFichero = DIR_FICHERO_SOLICITUDES
    var file = crearFichero(nombreFichero)

    fun crearFichero(ruta: String): File{
        var file= File(ruta)
        if (!file.exists()){
            file.createNewFile()
        }
        return file
    }




    override fun escribirSolicitudFichero(animal: Animal):Boolean {
        var conseguido= false
        var f=file
        var linea: String= ""

        try{
            linea=animal.toString() + "," + animal.solicitudes.last.tIpoSolicitud.toString() + ","+animal.solicitudes.last.email
            f.appendText(linea+System.lineSeparator())
            conseguido=true
        }catch(e:Exception){
            println(e)
        }

        return conseguido
    }



}