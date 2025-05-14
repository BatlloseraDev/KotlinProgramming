package com.ejercicio.protectoraexamen

import com.ejercicio.protectoraexamen.AccesoDatos.AnimalesDAOImpl
import com.ejercicio.protectoraexamen.AccesoDatos.GastoFechaDAOImpl
import com.ejercicio.protectoraexamen.Negocio.Animal
import com.ejercicio.protectoraexamen.Negocio.GastoFecha
import com.ejercicio.protectoraexamen.Negocio.Perro
import com.ejercicio.protectoraexamen.Presentacion.AnimalesController
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.MenuItem
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.Alert.AlertType
import javafx.stage.Stage
import java.time.LocalDateTime

class ProtectoraController {


    @FXML
    private lateinit var menuItemAnimales: MenuItem

    private var animalDAO = AnimalesDAOImpl()
    private var gastoFechaDAO = GastoFechaDAOImpl()


    @FXML
    fun abrirAnimales(event: ActionEvent) {
        try{
            val loader = FXMLLoader(AnimalesController::class.java.getResource("/com/ejercicio/protectoraexamen/Animales-view.fxml"))
            val root: Parent = loader.load()
            val stage = Stage()
            stage.scene = Scene(root)
            stage.title = "Animales"
            stage.showAndWait()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    @FXML
    fun onCalcularGCPressed(event: ActionEvent) {
        val arrayAnimales = animalDAO.getAllAnimales()
        var sumatorio= 0.0

        arrayAnimales.forEach {
            if(it is Perro){
                sumatorio+= it.gastoComida()
            }
        }
        mostrarAlerta("Gasto Comida","Se estima un gasto de comida aproximado de: $sumatorio g/semana",AlertType.INFORMATION)


    }

    @FXML
    fun onCalcularGVPressed(event: ActionEvent) {
        val arrayAnimales = animalDAO.getAllAnimales();
        var sumatorio= 0.0

        arrayAnimales.forEach {
            sumatorio+= it.gastoAnual()
        }

        val fechaActual = LocalDateTime.now();
        val gastoActual = GastoFecha("${fechaActual.year}-${fechaActual.monthValue}-${fechaActual.dayOfMonth}", sumatorio.toDouble())

        if(gastoFechaDAO.aniadirGasto(gastoActual)){
            mostrarAlerta("Exito","Se ha creado correctamente...", AlertType.INFORMATION)
        }
        else{
            mostrarAlerta("Fallo","Se ha originado un fallo", AlertType.WARNING)
        }

    }


    private fun mostrarAlerta(titulo:String, contenido:String, tipoAlerta: AlertType){
        val alert= Alert(tipoAlerta)
        alert.title = titulo
        alert.contentText = contenido
        alert.showAndWait()
    }


}