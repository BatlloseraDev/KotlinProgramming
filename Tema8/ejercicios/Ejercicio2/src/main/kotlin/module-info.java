module com.ejercicio.ejercicio2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.scripting;


    opens com.ejercicio.ejercicio2 to javafx.fxml;
    exports com.ejercicio.ejercicio2;
}