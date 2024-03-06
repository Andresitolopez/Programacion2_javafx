package co.edu.uniquindio.clientefx.cliente.Model;

public class TipoCliente {
    private String clienteBasico;

    private String clientePremium;

    private String clienteVip;


    public void setClienteBasico(String clienteBasico) {

        this.clienteBasico = clienteBasico;
    }


    public String getClienteBasico() {

        return clienteBasico;
    }

    public String getClientePremium() {

        return clientePremium;
    }

    public void setClientePremium(String clientePremium) {

        this.clientePremium = clientePremium;
    }

    public String getClienteVip() {

        return clienteVip;
    }

    public void setClienteVip(String clienteVip) {
        this.clienteVip = clienteVip;

    }
    @Override
    public String toString() {
        return "tipoCliente{" +
                "Tipo de cliente='" + clienteBasico + '\'' +
                ", Nombre='" + + '\'' +
                ", Apellido='" +  + '\'' +
                ", Direccion=" +
                ", Telefono='" +  + '\'' +
                ", Email='" +  + '\'' +
                '}';
    }

}
