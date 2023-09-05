package com.example.elephantpass;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CreateAccController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}