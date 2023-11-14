module com.example.inversematrix {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inversematrix to javafx.fxml;
    exports com.example.inversematrix;
}