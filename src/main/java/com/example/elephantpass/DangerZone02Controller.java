package com.example.elephantpass;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DangerZone02Controller {

    public JFXButton btnDashboard;
    public JFXButton btnLiveCamera;
    public JFXButton btnSummaryReport;
    public JFXButton btnElephantDetails;
    public JFXButton btnVillagersDetails;
    public JFXButton btnDangerZones;
    public JFXButton btnComplains;
    public JFXButton btnMap;
    public JFXButton btnLogOut;
    public Label lblDate;
    public Label lblTime;
    public Label dangerZone02ID;
    public Label dangerZone02Name;
    public Label dangerZone02Location;
    public JFXTextArea dangerZone02Description;
    @FXML
    private AnchorPane rootNode;

    public void btnDashboardAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the live dashBord page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/DashboardForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnLiveCameraAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the live camera page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/LiveCameraForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnSummaryReportAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the summary page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/SummaryReportForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnElephantDetailsAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the elephant page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/ElephantsForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnVillagersDetailsAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the villager page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/VillagersForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnDangerZonesAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the dangerZone page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/DangerZoneManagerForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnComplainsAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the complain page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/ComplainsForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnMapAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the Map Page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/MapForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnLogOutAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the loginpage");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/loginForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }
}
