package com.example.elephantpass;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardFormController {
    public BarChart barChartHumanDeaths;
    public BarChart barChartElephantsDeaths;
    public PieChart pieChartCrops;
    public Label lblFullName;
    public Label lblElephantDeaths;
    public Label lblDamages;
    public Label lblHumanDeaths;
    public Label lblElephantCount;
    public Label lblTime;
    public Label lblDate;
    public JFXButton btnLiveCamera;
    public JFXButton btnSummaryReport;
    public JFXButton btnElephantDetails;
    public JFXButton btnVillagersDetails;
    public JFXButton btnDangerZones;
    public JFXButton btnComplains;
    public JFXButton btnMap;
    public JFXButton btnLogOut;

    @FXML
    private AnchorPane rootNode;
    public void btnLiveCameraAction(ActionEvent actionEvent) {
    }

    public void btnSummaryReportAction(ActionEvent actionEvent) {
    }

    public void btnElephantDetailsAction(ActionEvent actionEvent) {
    }

    public void btnVillagersDetailsAction(ActionEvent actionEvent) {
    }

    public void btnDangerZonesAction(ActionEvent actionEvent) {
    }

    public void btnComplainsAction(ActionEvent actionEvent) {
    }

    public void btnMapAction(ActionEvent actionEvent) throws IOException {
        System.out.println("Navigating to the Map Page");
        Parent rootNode = FXMLLoader.load(getClass().getResource("/com/example/elephantpass/MapForm.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) this.rootNode.getScene().getWindow();
        stage.setTitle("Elephant Pass");
        stage.setScene(scene);
    }

    public void btnLogOutAction(ActionEvent actionEvent) {
    }
}
