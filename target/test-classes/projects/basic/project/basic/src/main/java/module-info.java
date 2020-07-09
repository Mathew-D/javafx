module archetype.it {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens it.pkg to javafx.fxml;
    exports it.pkg;
}