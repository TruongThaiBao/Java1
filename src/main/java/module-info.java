module com.example.java1bt3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java1bt3 to javafx.fxml;
    exports com.example.java1bt3;
}