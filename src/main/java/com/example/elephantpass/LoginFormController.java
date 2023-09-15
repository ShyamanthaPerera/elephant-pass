package com.example.elephantpass;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class LoginFormController extends CreateAccController {

    @FXML
    public JFXTextField txtUsername;
    @FXML
    public JFXTextField txtPassword;
    @FXML
    public JFXButton btnCreateAcc;
    @FXML
    public JFXButton btnSignIn;

    @FXML
    private AnchorPane rootNode;

    private String[][] saveDatail;


    public LoginFormController() {
        // Initialize saveDetail from CreateAccController
        setValues(super.saveDetail);
    }


    public void btnCreateAccAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the sign-up page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/CreateAcc.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnSignInAction(ActionEvent actionEvent) throws IOException {
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        // Replace this logic with your actual authentication mechanism.
        boolean isLoginSuccessful = authenticateUser(username, password);

        if (isLoginSuccessful) {
            // Login successful, you can open a new scene or perform other actions.
            showInfoAlert("Login Successful", "Welcome, " + username + "!");

            System.out.println("Navigating to the Dashboard");
            Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/DashboardForm.fxml"));
            Scene scene = new Scene(rootNode);
            Stage stage = (Stage) this.rootNode.getScene().getWindow();
            stage.setTitle("Elephant Pass");
            stage.setScene(scene);

        } else {
            // Login failed, show an error message to the user.
            showErrorAlert("Login Failed", "Invalid username or password.");
        }


    }

    private boolean authenticateUser(String username, String password) {
        for (int i = 0; i < saveDetail.length; i++) {
            if (saveDetail[i][4].equals(username) && saveDetail[i][5].equals(password)) {
                System.out.println("Password correct");
                return true;
            }
        }
        // If no matching user was found
        System.out.println("Username or password incorrect");
        return false;
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
    public void setValues(String[][]gg){
        this.saveDetail = gg;
        for (int i = 0; i < saveDetail.length; i++) {
            for (int j = 0; j < saveDetail[i].length; j++) {
                System.out.println(saveDetail[i][j]+",");
            }
        }
        //System.out.println(Arrays.toString(saveDetail));
    }
}
