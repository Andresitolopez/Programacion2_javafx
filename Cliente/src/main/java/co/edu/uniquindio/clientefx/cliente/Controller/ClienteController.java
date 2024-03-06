package co.edu.uniquindio.clientefx.cliente.Controller;

import co.edu.uniquindio.clientefx.cliente.Model.Cliente;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ClienteController {

    @FXML
    private Button btnAgregarCliente;

    @FXML
    private TextField txtApellido;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;

    @FXML
    private TextArea txtResultado;

    @FXML
    void onAgregarCliente(ActionEvent event) {
       AgregarCliente();

    }

    private void AgregarCliente() {
        Cliente cliente = new Cliente();

        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellido.getText());
        cliente.setCedula(txtCedula.getText());
        cliente.setDireccion(txtDireccion.getText());
        cliente.setEmail(txtEmail.getText());
        cliente.setTelefono(txtTelefono.getText());

        txtResultado.setText(cliente.toString());

    }
    @FXML
    void getClientePremiun(ActionEvent event) {

    }
    
    private void agregarCliente() {
        Cliente cliente = new Cliente();

        cliente.setNombre(txtNombre.getText());
        cliente.setApellido(txtApellido.getText());
        cliente.setCedula(txtCedula.getText());
        cliente.setDireccion(txtDireccion.getText());
        cliente.setTelefono(txtTelefono.getText());
        cliente.setEmail(txtEmail.getText());


        txtResultado.setText(cliente.toString());



    }

    // @FXML
    //private RadioButton rButtonClientePremium;
    //public void getClientePremium(ActionEvent actionEvent) {
    //  if(rButtonClientePremium.isSelected()){
    //    myLabel.setText(rButtonClientePremium.getText());
    //}

    //}
    //@FXML
    //private RadioButton rButtonClienteVip;
    //public void getClienteVip(ActionEvent actionEvent) {
    //    if(rButtonClienteVip.isSelected()){
    //       myLabel.setText(rButtonClienteVip.getText());
    //    }
    //}

    public void geTipoCliente(ActionEvent actionEvent) {

    }

    @FXML
    private Label myLabel;

    @FXML
    private RadioButton rButtonClienteBasico, rButtonClientePremium, rButtonClienteVip;

    public void getTipoCliente(ActionEvent event){

        if(rButtonClienteBasico.isSelected()){
            myLabel.setText(rButtonClienteBasico.getText());
            System.out.println("Cliente Basico ");
        }
        else if(rButtonClientePremium.isSelected()){
            myLabel.setText(rButtonClientePremium.getText());
            System.out.println("Cliente premium ");
        }
        else if(rButtonClienteVip.isSelected()){
            myLabel.setText(rButtonClienteVip.getText());
            System.out.println("Cliente Vip ");
        }
    }



    @FXML
    void initialize() {

    }

    public void setrButtonClientePremium(RadioButton rButtonClientePremium) {
        this.rButtonClientePremium = rButtonClientePremium;
    }
}
