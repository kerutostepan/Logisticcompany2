package com.example.logisticcompany.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.logisticcompany.MainLogisticCompany;
import javafx.fxml.FXML;
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
        mainMenu.setOnAction(actionEvent -> {
          MainLogisticCompany.SwitchScene("hello-view.fxml",mainMenu);
        });
    }

}
