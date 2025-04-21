package org.example.variasventanas

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.ButtonType
import javafx.scene.control.TextField
import javafx.stage.Modality
import javafx.stage.Stage
import Modelo.PasoDatos
import Modelo.Persona
import javafx.application.Platform
import javafx.fxml.FXMLLoader
import java.net.URL
import java.util.*

class Ventana1Controller : Initializable {

    override fun initialize(url: URL?, rb: ResourceBundle?) {
        PasoDatos.p = Persona("DAW1",99)
        //Se usa cualquier elemento de la ventana para obtener el Scene/Stage y s ele añade el listener.
        TXTNombre1.text = PasoDatos.p.nombre
        TXTEdad1.text = PasoDatos.p.edad.toString()
    }

    @FXML
    private lateinit var TXTEdad1: TextField

    @FXML
    private lateinit var TXTNombre1: TextField

    @FXML
    private fun onIrSegundaBTNClick() {

        PasoDatos.p = Persona(TXTNombre1.text,TXTEdad1.text.toInt())
        println(PasoDatos.p)


        val fxmlLoader  = FXMLLoader(HelloApplication::class.java.getResource("Vista2.fxml"))
        val scene = Scene(fxmlLoader.load())
        val stage = Stage()
        stage.title = "Ventana secundaria"
        stage.scene = scene
        stage.initModality(Modality.APPLICATION_MODAL)
        stage.setOnCloseRequest { event ->
            val alert = Alert(Alert.AlertType.CONFIRMATION)
            alert.title = "Cerrando segunda ventana"
            alert.headerText = "Esto cerrará la ventana actual"
            alert.buttonTypes.setAll(ButtonType.YES, ButtonType.NO)
            alert.contentText = "¿Está seguro?"

            //Mostrar y esperar a que el usuario responda
            val res = alert.showAndWait()
            if (res.get() == ButtonType.NO) event.consume()
        }
        stage.showAndWait()

        //Aquí recuperamos lo que ha cambiado en la segunda ventana.
        TXTNombre1.text = PasoDatos.p.nombre
        TXTEdad1.text = PasoDatos.p.edad.toString()
    }

    @FXML
    fun btnSalirClick(event: ActionEvent) {
        val alert = Alert(Alert.AlertType.CONFIRMATION)
//        alert.buttonTypes.remove(ButtonType.OK)
//        alert.buttonTypes.add(ButtonType.NO)
//        alert.buttonTypes.add(ButtonType.YES)
        alert.title = "Saliendo de la aplicación."
        alert.buttonTypes.setAll(ButtonType.YES, ButtonType.NO)
        alert.contentText = "¿Está seguro?"
        //alert.initOwner(primaryStage.getOwner());
        val res = alert.showAndWait()
        if (res.isPresent) {
            if (res.get() == ButtonType.YES) {
                Platform.exit()
            }
        }
    }
}