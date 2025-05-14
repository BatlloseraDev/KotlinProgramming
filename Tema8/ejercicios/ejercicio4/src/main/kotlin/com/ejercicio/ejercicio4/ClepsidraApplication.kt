package com.ejercicio.ejercicio4

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class ClepsidraApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(ClepsidraApplication::class.java.getResource("Clepsidra-view.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Clepsidra"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(ClepsidraApplication::class.java)
}