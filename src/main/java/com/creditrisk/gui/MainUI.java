package com.creditrisk.gui;

import com.creditrisk.service.CreditRiskAnalysisService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI extends Application {
    private CreditRiskAnalysisService service;

    @Override
    public void start(Stage primaryStage) {
        service = new CreditRiskAnalysisService();

        VBox root = new VBox();

        Label customerIdLabel = new Label("Customer ID:");
        TextField customerIdField = new TextField();
        Button analyzeButton = new Button("Analyze Risk");

        analyzeButton.setOnAction(e -> {
            int customerId = Integer.parseInt(customerIdField.getText());
            service.analyzeCustomerRisk(customerId);
            // Display results or update UI
        });

        root.getChildren().addAll(customerIdLabel, customerIdField, analyzeButton);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Credit Risk Analysis");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
