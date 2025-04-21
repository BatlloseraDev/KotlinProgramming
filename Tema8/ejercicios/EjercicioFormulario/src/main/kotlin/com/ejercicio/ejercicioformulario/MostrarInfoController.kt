package com.ejercicio.ejercicioformulario

import com.ejercicio.ejercicioformulario.Modelo.PersonaObjeto
import javafx.fxml.Initializable
import java.net.URL
import java.util.*
import javafx.fxml.FXML
import javafx.scene.control.TextArea
import javafx.scene.control.TextField
import javafx.event.ActionEvent
import javafx.scene.Node
import javafx.stage.Stage


class MostrarInfoController:Initializable {

    @FXML
    private lateinit var txtAsignaturas: TextArea

    @FXML
    private lateinit var txtCurso: TextField

    @FXML
    private lateinit var txtDual: TextField

    @FXML
    private lateinit var txtEdad: TextField

    @FXML
    private lateinit var txtNombre: TextField



    @FXML
    fun onBtnVolverPressed(event: ActionEvent) {
        val source: Node = event!!.source as Node
        val stage = source.scene.window as Stage
        stage.close()
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        txtNombre.text= PersonaObjeto.p.nombre
        txtEdad.text = PersonaObjeto.p.edad.toString()
        txtDual.text= if(PersonaObjeto.p.dual) "Si" else "No"
        txtCurso.text = PersonaObjeto.p.curso
        txtAsignaturas.text="";
        for(asignatura in PersonaObjeto.p.asignaturas){
            txtAsignaturas.text += "$asignatura, "
        }

    }


}