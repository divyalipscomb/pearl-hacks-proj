module com.pearl.pearlhacksproj1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pearl.pearlhacksproj1 to javafx.fxml;
    exports com.pearl.pearlhacksproj1;
}