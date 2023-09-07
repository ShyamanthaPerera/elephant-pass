package com.example.elephantpass;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CreateAccController {


    @FXML
    private JFXTextField txtFirstName;

    @FXML
    void btnAction(ActionEvent event) {
        System.out.println(txtFirstName.getText());

    }


}