package co.edu.uniquindio.poo;

public class Cliente extends Persona{

public Cliente (String nombre, String apellido, String cedula, String direccion, String email, String telefono){
    super(nombre, apellido, cedula, direccion, email, telefono);
}

@Override
public String toString() {
    return "nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
                + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono + "]";
}






    
}
