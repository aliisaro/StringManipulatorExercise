module com.example.stringmanipulatorexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stringmanipulatorexercise to javafx.fxml;
    exports com.example.stringmanipulatorexercise;
}