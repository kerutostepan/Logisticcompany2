package com.example.logisticcompany.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.logisticcompany.Back.Command;
import com.example.logisticcompany.MainLogisticCompany;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

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
        mainMenu.setOnAction(actionEvent -> MainLogisticCompany.SwitchScene("hello-view.fxml", mainMenu));
        seeCountry.setOnAction(actionEvent -> {
            Command command = new Command();
            command.name();
            command.all();

            Alert alert = new Alert(Alert.AlertType.INFORMATION, command.v());
            alert.showAndWait();
        });
        addCountry.setOnAction(actionEvent -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "1");
            alert.showAndWait();
        });
        priceTwo.setOnAction(actionEvent -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "1");
            alert.showAndWait();
        });
        checkOrder.setOnAction(actionEvent -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "1");
            alert.showAndWait();
        });
        time.setOnAction(actionEvent -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "1");
            alert.showAndWait();
        });
    }

}
