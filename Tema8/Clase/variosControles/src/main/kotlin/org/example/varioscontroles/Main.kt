package org.example.varioscontroles

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.ButtonType
import javafx.stage.Stage

class Main : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(Main::class.java.getResource("VentanaPrincipal.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Ejemplo de combo"
        stage.scene = scene
        stage.isResizable = false
        stage.setOnCloseRequest { event ->
            //event.consume() // cancela el cierre
            println("Intento de cerrar bloqueado 😎")
            val alert = Alert(Alert.AlertType.CONFIRMATION)
            alert.title = "Confirmación"
            alert.headerText = "¿Estás seguro?"
            alert.contentText = "¿Deseas salir?"
            alert.buttonTypes.add(ButtonType.NO)
            alert.buttonTypes.add(ButtonType.YES)
            alert.buttonTypes.remove(ButtonType.CANCEL)
            alert.buttonTypes.remove(ButtonType.OK)
            //alert.buttonTypes.setAll(ButtonType.YES, ButtonType.NO)  //Con esta opción no hace falta todo lo anterior. Solo deja los botones que indiquemos en serAll.

            //Mostrar y esperar a que el usuario responda
            val res = alert.showAndWait()
            if (res.get() == ButtonType.NO) event.consume()

        }

        stage.show()
    }
}

fun main() {
    Application.launch(Main::class.java)
}