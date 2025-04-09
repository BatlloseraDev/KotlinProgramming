package com.example.demo_clase_1

import javafx.animation.AnimationTimer
import javafx.application.Application
import javafx.scene.*
import javafx.scene.paint.Color
import javafx.scene.paint.PhongMaterial
import javafx.scene.shape.Box
import javafx.scene.shape.Cylinder
import javafx.scene.shape.Sphere
import javafx.scene.transform.Rotate
import javafx.stage.Stage

class Advanced3DScene : Application() {

    private var angle = 0.0

    override fun start(primaryStage: Stage) {
        // Create 3D objects
        val box = Box(100.0, 100.0, 100.0).apply {
            material = PhongMaterial(Color.BLUE)
            translateX = -150.0
        }

        val sphere = Sphere(50.0).apply {
            material = PhongMaterial(Color.RED)
            translateX = 150.0
        }

        val cylinder = Cylinder(40.0, 100.0).apply {
            material = PhongMaterial(Color.GREEN)
            translateY = 150.0
        }

        // Create lights
        val pointLight = PointLight(Color.WHITE).apply {
            translateX = 200.0
            translateY = -100.0
            translateZ = -300.0
        }

        val ambientLight = AmbientLight(Color.rgb(50, 50, 50))

        // Create a camera
        var camera = PerspectiveCamera(true).apply {
            nearClip = 0.1
            farClip = 10000.0
            translateZ = -500.0
        }

        // Create root group
        val root = Group(box, sphere, cylinder, pointLight, ambientLight)

        // Create subscene
        val subScene = SubScene(root, 800.0, 600.0, true, SceneAntialiasing.BALANCED).apply {
            fill = Color.LIGHTGRAY
            this.camera = camera  // o simplemente camera = camera
        }

        // Set up the scene and stage
        primaryStage.apply {
            title = "Advanced JavaFX 3D with Kotlin"
            scene = Scene(Group(subScene), 800.0, 600.0)
            show()
        }

        // Animation timer
        object : AnimationTimer() {
            override fun handle(now: Long) {
                angle += 0.5
                box.rotationAxis = Rotate.Y_AXIS
                box.rotate = angle

                sphere.rotationAxis = Rotate.X_AXIS
                sphere.rotate = angle * 0.7

                cylinder.rotationAxis = Rotate.Z_AXIS
                cylinder.rotate = angle * 1.2
            }
        }.start()
    }
}

fun main() {
    Application.launch(Advanced3DScene::class.java)
}