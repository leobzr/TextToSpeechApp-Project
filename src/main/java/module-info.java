module org.example.texttospeechgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires freetts;


    opens org.example.texttospeechgui to javafx.fxml;
    exports org.example.texttospeechgui;
}