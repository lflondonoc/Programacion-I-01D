package co.edu.uniquindio.poo;

public class Cliente extends Persona{
    private String email;

    public Cliente(String nombre, String cedula, String edad, String email){
        super(nombre, cedula, edad);
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", email=" + email + ", cedula=" + cedula + ", edad=" + edad + "]";
    }
    
}
