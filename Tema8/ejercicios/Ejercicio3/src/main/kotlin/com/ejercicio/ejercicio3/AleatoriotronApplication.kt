package com.ejercicio.ejercicio3

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class AleatoriotronApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(AleatoriotronApplication::class.java.getResource("Alatoriotron-view.fxml"))
        val scene = Scene(fxmlLoader.load())
        stage.title = "Aleatoriotron"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(AleatoriotronApplication::class.java)
}