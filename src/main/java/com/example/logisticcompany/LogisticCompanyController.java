package com.example.logisticcompany;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LogisticCompanyController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addCountry;

    @FXML
    private Button checkOrder;
    @FXML
    private Button mainMenu;

    @FXML
    private Button priceTwo;
    @FXML
    private Button seeCountry;

    @FXML
    private Button time;

    @FXML
    void initialize() {
        mainMenu.setOnAction(actionEvent -> {
            mainMenu.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("hello-view.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent parent = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(parent));
            stage.showAndWait();
        });
    }

}
