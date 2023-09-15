package com.example.elephantpass;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateAccController {
    public String[][] saveDetail = new String[2][6];
    public JFXTextField txtLasName;
    public JFXTextField txtETF;
    public JFXTextField txtNIC;
    public JFXTextField txtUsername;
    public JFXTextField txtPassword;

    @FXML
    private AnchorPane rootNode;

    @FXML
    private JFXTextField txtFirstName;

    void callArray(){
        for (int i = 0; i < saveDetail.length; i++) {
            int count = 0;
            for (int j = 0; j < saveDetail[i].length; j++) {
                if (saveDetail[i][j] != null) {
                    count++;
                }
            }
            if (count != 6) {
                saveDetail[i][0] = txtFirstName.getText();
                saveDetail[i][1] = txtLasName.getText();
                saveDetail[i][2] = txtETF.getText();
                saveDetail[i][3] = txtNIC.getText();
                saveDetail[i][4] = txtUsername.getText();
                saveDetail[i][5] = txtPassword.getText();
                break;
            }
        }
    }
    @FXML
    void btnCreateAccAction(ActionEvent event) throws IOException {
        callArray();

        System.out.println("Navigating to the sign-in page");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/elephantpass/LoginForm.fxml"));
        Parent rootNode = fxmlLoader.load();
        LoginFormController loginFormController = fxmlLoader.getController();

        loginFormController.setValues(saveDetail);

        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Sign-Up Page");
        stage.setScene(scene);
        stage.show();
    }

    public void btnSignInAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the sign-in page");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/com/example/elephantpass/LoginForm.fxml"));
        Parent rootNode = fxmlLoader.load();
//        LoginFormController loginFormController = fxmlLoader.getController();
//        loginFormController.setValues("hi");

        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Sign-Up Page");
        stage.setScene(scene);
    }
}