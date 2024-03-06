package co.edu.uniquindio.clientefx.cliente.Model;

public class Cliente {
    private String Nombre,Apellido,Cedula, Direccion, Email,Telefono;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String cedula) {
        Nombre = nombre;
        Apellido = apellido;
        Cedula = cedula;
    }

    public Cliente(String nombre, String apellido, String cedula, String telefono) {
        Nombre = nombre;
        Apellido = apellido;
        Cedula = cedula;
        Telefono = telefono;
    }

    public Cliente(String nombre, String apellido, String cedula, String direccion,
                   String email, String telefono) {
        Nombre = nombre;
        Apellido = apellido;
        Cedula = cedula;
        Direccion = direccion;
        Email = email;
        Telefono = telefono;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Cedula='" + Cedula + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", Email='" + Email + '\'' +
                ", Telefono='" + Telefono + '\'' +
                '}';
    }
}


