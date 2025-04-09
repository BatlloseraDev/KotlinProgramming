module com.example.ejemploinicial {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.example.ejemploinicial to javafx.fxml;
    exports com.example.ejemploinicial;
}