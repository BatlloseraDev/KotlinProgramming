module com.ejercicio.protectoraexamen {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;


    opens com.ejercicio.protectoraexamen to javafx.fxml;
    exports com.ejercicio.protectoraexamen;

    opens com.ejercicio.protectoraexamen.Presentacion to javafx.fxml;
    exports com.ejercicio.protectoraexamen.Presentacion to javafx.fxml;
}