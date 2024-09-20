package co.edu.uniquindio.poo;


public class Persona {
    public String nombre;
    public String cedula;
    public String edad;

    
    public Persona(String nombre, String cedula, String edad) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCedula() {
        return cedula;
    }


    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


    public String getEdad() {
        return edad;
    }


    public void setEdad(String edad) {
        this.edad = edad;
    }
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    

}
