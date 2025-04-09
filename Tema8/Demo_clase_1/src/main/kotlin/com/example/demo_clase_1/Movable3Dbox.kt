package com.example.demo_clase_1

import javafx.animation.AnimationTimer
import javafx.application.Application
import javafx.scene.*
import javafx.scene.input.KeyEvent
import javafx.scene.paint.Color
import javafx.scene.paint.PhongMaterial
import javafx.scene.shape.Box
import javafx.scene.transform.Rotate
import javafx.stage.Stage

class Movable3DBox : Application() {

    // Variables para la posición del cubo
    private var x = 0.0
    private var y = 0.0
    private var z = 0.0
    private var angle = 0.0

    override fun start(primaryStage: Stage) {
        // Crear un cubo 3D
        val box = Box(100.0, 100.0, 100.0).apply {
            material = PhongMaterial(Color.BLUE)
        }

        // Configurar la cámara
        val camera = PerspectiveCamera(true).apply {
            nearClip = 0.1
            farClip = 10000.0
            translateZ = -500.0
        }

        // Crear la escena
        val root = Group(box)
        val scene = Scene(root, 800.0, 600.0, true).apply {
            fill = Color.LIGHTGRAY
            this.camera = camera
        }

        // Configurar el escenario
        primaryStage.apply {
            title = "Cubo 3D Movible con Teclado"
            this.scene = scene
        }

        // Manejador de eventos de teclado
        scene.addEventHandler(KeyEvent.KEY_PRESSED) { event ->
            when (event.code) {
                javafx.scene.input.KeyCode.UP -> y -= 10.0
                javafx.scene.input.KeyCode.DOWN -> y += 10.0
                javafx.scene.input.KeyCode.A -> x -= 10.0
                javafx.scene.input.KeyCode.LEFT -> angle -= 10.0
                javafx.scene.input.KeyCode.D -> x += 10.0
                javafx.scene.input.KeyCode.RIGHT -> angle += 10.0
                javafx.scene.input.KeyCode.W -> z += 10.0    // Acercar
                javafx.scene.input.KeyCode.S -> z -= 10.0    // Alejar
                else -> {}
            }

            // Actualizar posición del cubo
            box.translateX = x
            box.translateY = y
            box.translateZ = z

            println("Posición: X=$x, Y=$y, Z=$z") // Opcional: mostrar posición en consola
        }

        primaryStage.show()
        object : AnimationTimer() {
            override fun handle(now: Long) {

                box.rotationAxis = Rotate.Y_AXIS
                box.rotate = angle

            }
        }.start()



    }
}

fun main() {
    Application.launch(Movable3DBox::class.java)
}