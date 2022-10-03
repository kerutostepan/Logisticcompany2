module com.example.logisticcompany {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.logisticcompany to javafx.fxml;
    exports com.example.logisticcompany;
}