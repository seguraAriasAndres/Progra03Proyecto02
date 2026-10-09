module cr.ac.una.est.progra03proyecto02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cr.ac.una.est.progra03proyecto02 to javafx.fxml;
    exports cr.ac.una.est.progra03proyecto02;
}