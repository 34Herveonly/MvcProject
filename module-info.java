module org.mavenproject.userinterfacefx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.mavenproject.userinterfacefx to javafx.fxml;
    exports org.mavenproject.userinterfacefx;
}