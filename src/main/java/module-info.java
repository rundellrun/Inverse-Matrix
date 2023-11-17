module com.example.inversematrix {
    requires javafx.controls;
    requires javafx.fxml;
    requires commons.math3;


    opens com.example.inversematrix to javafx.fxml;
    exports com.example.inversematrix;
}