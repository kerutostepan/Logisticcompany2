package com.example.logisticcompany.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.logisticcompany.MainLogisticCompany;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class EldoradoController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button addWishes;

    @FXML
    private Button deliveryTerm;

    @FXML
    private Button mainMenu;

    @FXML
    private Button priceYourOrder;

    @FXML
    private Button showWhishes;

    @FXML
    private Button showYourOrder;

    @FXML
    void initialize() {
        mainMenu.setOnAction(actionEvent -> {
            MainLogisticCompany.SwitchScene("hello-view.fxml",mainMenu);
        });

    }

}
