package co.edu.uniquindio.poo;

public class Miembro {
    private String nombre;
    private int edad;
    private String genero;
    private String cedula;
    private Membresia membresia;

    
    public Miembro(String nombre, int edad, String genero, String cedula, Membresia membresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cedula = cedula;
        this.membresia = membresia;
    }

    
    @Override
    public String toString() {
        return "Miembro [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", cedula=" + cedula
                + ", membresia=" + membresia + "]";
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }

}