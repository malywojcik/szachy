module traproom.szachy {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens traproom.szachy to javafx.fxml;
    exports traproom.szachy;
}