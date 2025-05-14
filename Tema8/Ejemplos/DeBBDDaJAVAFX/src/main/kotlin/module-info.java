module com.example.debbddajavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.sql;

    opens com.example.debbddajavafx to javafx.fxml;
    opens com.example.debbddajavafx.Presentacion to javafx.fxml;

    exports com.example.debbddajavafx;
    exports com.example.debbddajavafx.Presentacion to javafx.fxml;
}
