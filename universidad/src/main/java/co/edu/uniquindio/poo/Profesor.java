package co.edu.uniquindio.poo;

public class Profesor {
    private String nombre;
    private String numeroIdentificacion;

    public Profesor(String nombre, String numeroIdentificacion){
        this.nombre= nombre;
        this.numeroIdentificacion=numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
