module com.example.observablecollections {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.observablecollections to javafx.fxml;
    exports com.example.observablecollections;
}