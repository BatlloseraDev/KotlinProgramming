package com.ejercicio.ejercicioformulario

import com.ejercicio.ejercicioformulario.GestorFicheros.AlumnoDAOFicheros
import com.ejercicio.ejercicioformulario.Modelo.Persona
import com.ejercicio.ejercicioformulario.Modelo.PersonaObjeto
import javafx.application.Platform
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.fxml.Initializable
import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.layout.Pane
import javafx.stage.Modality
import javafx.stage.Stage
import java.net.URL
import java.time.LocalDate
import java.time.Period
import java.util.*

class FormularioController:Initializable {



    @FXML
    private lateinit var txtEdad: TextField

    @FXML
    private lateinit var txtNombre: TextField

    @FXML
    private lateinit var paneAsignaturas: Pane

    @FXML
    private lateinit var chbCurso: ChoiceBox<String>

    @FXML
    private lateinit var rbSi: RadioButton


    @FXML
    fun onFechaPressed(event: ActionEvent) {

        val source: Node? = event.source as? Node
        if (source is DatePicker) {
            val date: LocalDate? = source.value
            if(date != null) {

                txtEdad.text = calcularAnios(LocalDate.now(), date).toString()

            }
        }

    }



    fun calcularAnios(currentDate: LocalDate, selectedDate: LocalDate):Int
    {
        val period: Period = Period.between(selectedDate, currentDate)
        return  period.years
    }


    @FXML
    fun OnBtnAceptarPressed(event: ActionEvent) {
        //guardar en la base de datos
        val alumno = AlumnoDAOFicheros()
        var check= checkAllInpunts()
        if(check.isNotEmpty()){
            mostrarAlertError(check)
        }
        else{
            PersonaObjeto.p = Persona(txtNombre.text,txtEdad.text.toInt(),chbCurso.value,recolectorAsignaturas(),rbSi.isSelected)
            mostrarGuardado(alumno.insertAlumno(PersonaObjeto.p))
        }

    }

    fun mostrarGuardado(exito: Boolean){
        if (exito){
            mostrarAlertInfo("¡Guardado exitosamente!")

        }else{
            mostrarAlertError("Hubo un fallo en el guardado")
        }

    }

    fun mostrarAlertInfo(infoTexto: String){
        val alert = Alert(Alert.AlertType.INFORMATION)
        alert.title = "Informe"
        alert.headerText = infoTexto
        alert.buttonTypes.setAll(ButtonType.OK)
        alert.showAndWait()
    }

    fun mostrarAlertError(errorTexto: String){
        val alert = Alert(Alert.AlertType.ERROR)
        alert.title = "Error"
        alert.headerText = errorTexto
        alert.buttonTypes.setAll(ButtonType.OK)
        alert.showAndWait()
    }


    @FXML
    fun OnBtnMostrarPressed(event: ActionEvent) {

        var check=checkAllInpunts()
        if(check.isNotEmpty()){
           mostrarAlertError(check)
        }
        else{
            PersonaObjeto.p = Persona(txtNombre.text,txtEdad.text.toInt(),chbCurso.value,recolectorAsignaturas(),rbSi.isSelected)


            val fxmlLoader = FXMLLoader(FormularioApplication::class.java.getResource("MostrarInformacion.fxml"))
            val scene= Scene(fxmlLoader.load())
            val stage = Stage()
            stage.title = "Información Formulario"
            stage.scene = scene
            stage.initModality(Modality.APPLICATION_MODAL)
            stage.isResizable = false
            stage.setOnCloseRequest { event ->
                val alert = Alert(Alert.AlertType.CONFIRMATION)
                alert.title = "Cerrando segunda ventana"
                alert.headerText = "Esto cerrará la ventana actual"
                alert.buttonTypes.setAll(ButtonType.YES, ButtonType.NO)
                alert.contentText = "¿Esta seguro?"

                val res= alert.showAndWait()
                if(res.get() == ButtonType.NO) event.consume()
            }
            stage.showAndWait()
        }


    }
    fun checkAllInpunts():String{
        var falta=""
        try{
            if(txtNombre.text.isEmpty()) falta="Falta Informacion en el nombre"
            if(txtEdad.text.isEmpty()) falta="Falta Informacion en la edad"
            else txtEdad.text.toInt()
            if(chbCurso.value.isEmpty()) falta="Falta Informacion en el curso"
            if(recolectorAsignaturas().size<=0)falta="Falta informacion en las asignaturas"
        }
        catch (e:NumberFormatException){
            falta="Fallo al introducir la edad"
        }
        catch (e:NullPointerException){
            falta="No hay nada seleccionado en el curso"
        }
        catch (e:Exception){
            println(e)
            falta="Error desconocido"
        }

        return falta
    }




    fun recolectorAsignaturas():ArrayList<String>
    {
        var asignaturas:ArrayList<String> = ArrayList()

        for(asignatura in paneAsignaturas.children)
        {
            if(asignatura is CheckBox && asignatura.isSelected){
                asignaturas.add(asignatura.text)
            }
        }
        return asignaturas
    }



    @FXML
    fun onBtnSalirPressed(event: ActionEvent) {
        val alert = Alert(Alert.AlertType.CONFIRMATION)
        alert.title = "Saliendo de la aplicación."
        alert.buttonTypes.setAll(ButtonType.YES, ButtonType.NO)
        alert.contentText = "¿Está seguro?"
        val res = alert.showAndWait()
        if (res.isPresent) {
            if (res.get() == ButtonType.YES) {
                Platform.exit()
            }
        }
    }

    override fun initialize(p0: URL?, p1: ResourceBundle?) {
        chbCurso.items.add("DAW")
        chbCurso.items.add("DAM")
    }


}