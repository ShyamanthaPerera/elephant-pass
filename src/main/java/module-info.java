module com.example.elephantpass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.elephantpass to javafx.fxml;
    exports com.example.elephantpass;
}