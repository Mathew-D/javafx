#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
module ${groupId} {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens ${package} to javafx.fxml;
    exports ${package};
}