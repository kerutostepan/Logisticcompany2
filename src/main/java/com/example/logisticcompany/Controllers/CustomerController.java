package com.example.logisticcompany.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.logisticcompany.MainLogisticCompany;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CustomerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button atb;

    @FXML
    private Button eldorado;

    @FXML
    private Button eva;

    @FXML
    void initialize() {
        atb.setOnAction(actionEvent -> MainLogisticCompany.SwitchScene("Atb.fxml",atb));
        eldorado.setOnAction(actionEvent -> MainLogisticCompany.SwitchScene("Eldorado.fxml",eldorado));
        eva.setOnAction(actionEvent -> MainLogisticCompany.SwitchScene("Eva.fxml",eva));
    }

}
