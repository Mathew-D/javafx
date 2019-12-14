module it.pkg {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.pkg to javafx.fxml;
    exports it.pkg;
}