module com.example.controles {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.controles to javafx.fxml;
    exports com.example.controles;
}