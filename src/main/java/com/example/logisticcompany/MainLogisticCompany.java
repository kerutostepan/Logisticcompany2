package com.example.logisticcompany;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainLogisticCompany extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainLogisticCompany.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 500);
        stage.setTitle("App");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
    public static void SwitchScene(String str, Button button){
        button.getScene().getWindow().hide();
        FXMLLoader fxmlLoader = new FXMLLoader(MainLogisticCompany.class.getResource(str));
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setTitle("App");
        stage.setScene(new Scene(fxmlLoader.getRoot()));
        stage.setResizable(false);
        stage.show();
    };

    public static void main(String[] args) {
        launch();
    }
}