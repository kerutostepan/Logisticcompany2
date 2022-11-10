package com.example.logisticcompany.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import com.example.logisticcompany.MainLogisticCompany;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Customer;

    @FXML
    private Button LogisticCompany;

    @FXML
    void initialize() {
        LogisticCompany.setOnAction(actionEvent -> {
           MainLogisticCompany.SwitchScene("LogisticCompany.fxml",LogisticCompany);
        });
        Customer.setOnAction(actionEvent -> {
          MainLogisticCompany.SwitchScene("Customer.fxml",Customer);
           });
    }

}
