module nateolearyenterline.csc262project {
    requires javafx.controls;
    requires javafx.fxml;

    opens nateolearyenterline.csc262project to javafx.fxml;
    exports nateolearyenterline.csc262project;
}