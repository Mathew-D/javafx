#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
module ${package} {
    requires javafx.controls;
    requires javafx.fxml;

    opens ${package} to javafx.fxml;
    exports ${package};
}