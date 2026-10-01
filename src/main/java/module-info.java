module com.example.oop_48_eco_resort_such_as_dusai {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oop_48_eco_resort_such_as_dusai to javafx.fxml;
    exports com.example.oop_48_eco_resort_such_as_dusai;
}