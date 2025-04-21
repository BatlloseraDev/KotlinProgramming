package org.example.variasventanas

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Alert
import javafx.scene.control.ButtonType
import javafx.stage.Stage

class HelloApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("Vista1.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Ventana 1"
        stage.scene = scene
        stage.setOnCloseRequest { event ->
            val alert = Alert(Alert.AlertType.CONFIRMATION)
            alert.title = "Saliendo de la aplicación"
            alert.headerText = "Esto cerrará la aplicación"
            alert.buttonTypes.setAll(ButtonType.YES, ButtonType.NO)
            alert.contentText = "¿Está seguro?"

            //Mostrar y esperar a que el usuario responda
            val res = alert.showAndWait()
            if (res.get() == ButtonType.NO) event.consume()
        }
        stage.show()
    }
}

fun main() {
    Application.launch(HelloApplication::class.java)
}