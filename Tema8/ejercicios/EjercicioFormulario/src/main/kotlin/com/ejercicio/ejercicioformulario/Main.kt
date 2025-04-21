package com.ejercicio.ejercicioformulario

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class FormularioApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(FormularioApplication::class.java.getResource("formularioView.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Formulario"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(FormularioApplication::class.java)
}