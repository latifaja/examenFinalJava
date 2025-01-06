module com.emaple.examenjavapoo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.emaple.examenjavapoo to javafx.fxml;
    exports com.emaple.examenjavapoo;
}