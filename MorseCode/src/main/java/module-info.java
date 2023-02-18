module com.example.morsecode {
    requires javafx.controls;
    requires javafx.fxml;

    requires VirtualizedFX;

    opens com.example.morsecode to javafx.fxml;
    exports com.example.morsecode;
/*    exports com.example.morsecode.main;
    opens com.example.morsecode.main to javafx.fxml;
    exports com.example.morsecode.controller;
    opens com.example.morsecode.controller to javafx.fxml;
    exports com.example.morsecode.model;
    opens com.example.morsecode.model to javafx.fxml;
    exports com.example.morsecode;*/
}