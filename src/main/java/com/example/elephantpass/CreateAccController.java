package com.example.elephantpass;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateAccController {


    public JFXTextField txtLasName;
    public JFXTextField txtETF;
    public JFXTextField txtNIC;
    public JFXTextField txtUsername;
    public JFXTextField txtPassword;
    @FXML
    private JFXTextField txtFirstName;

    @FXML
    void btnCreateAccAction(ActionEvent event) {
        System.out.println(txtFirstName.getText());

//        try {
//            AnchorPane parentContent = FXMLLoader.load(getClass().getResource(("src/main/resources/com/example/elephantpass/LoginForm.fxml")));
//
//            AnchorPane root = new AnchorPane();
//            root.getChildren().clear();
//            root.getChildren().setAll(parentContent);
//
//            ((Stage) root.getScene().getWindow()).setHeight(690);
//            ((Stage) root.getScene().getWindow()).setWidth(1213);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }


    public void btnSignInAction(ActionEvent actionEvent) {
    }
}