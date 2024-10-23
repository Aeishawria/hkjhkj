module com.mycompany.projectftnt {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;

    opens com.mycompany.projectftnt to javafx.fxml;
    exports com.mycompany.projectftnt;
}
