package co.edu.uniquindio.poo;

public class Cliente extends Persona{

    public Cliente(String nombre, String apellido, String cedula, String telefono){
        super(nombre, apellido, cedula, telefono);
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", apellido=" + apellido + ", cedula=" + cedula
                + ", telefono=" + telefono;
    }
    
    
}
