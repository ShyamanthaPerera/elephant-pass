package com.example.elephantpass;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.event.ActionEvent;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.cert.PolicyNode;

public class LoginFormController {

    public JFXTextField txtUsername;
    public JFXTextField txtPassword;
    public JFXButton btnCreateAcc;
    public JFXButton btnSignIn;

    public void btnCreateAccAction(ActionEvent actionEvent) throws IOException {
        System.out.println("logging to the signup page");
        Parent rootNode =FXMLLoader.load(this.getClass().getResource("/com/example/elephantpass/CreateAcc.fxml"));

        Scene scene= new Scene(rootNode);
        Stage stage= new Stage();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
        stage.show();

    }

    public void btnSignInAction(ActionEvent actionEvent) {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        // Replace this logic with your actual authentication mechanism.
        boolean isLoginSuccessful = authenticateUser(username, password);

        if (isLoginSuccessful) {
            // Login successful, you can open a new scene or perform other actions.
            showInfoAlert("Login Successful", "Welcome, " + username + "!");
        } else {
            // Login failed, show an error message.
            showErrorAlert("Login Failed", "Invalid username or password.");
        }
    }
    private boolean authenticateUser(String username, String password) {
        return username.equals("your_username") && password.equals("your_password");
    }

    private void showErrorAlert(String title, String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void showInfoAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
