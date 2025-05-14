module com.ejercicio.ejercicio4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.ejercicio.ejercicio4 to javafx.fxml;
    exports com.ejercicio.ejercicio4;
}