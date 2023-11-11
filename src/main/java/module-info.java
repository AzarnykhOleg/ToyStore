module com.example.toystore {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.toystore to javafx.fxml;
    exports com.example.toystore;
}