module co.edu.uniquindio.clientefx.cliente {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.clientefx.cliente to javafx.fxml;
    exports co.edu.uniquindio.clientefx.cliente;

    opens co.edu.uniquindio.clientefx.cliente.Controller;
    exports co.edu.uniquindio.clientefx.cliente.Controller;



}