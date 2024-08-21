package co.edu.uniquindio.poo;

public class Estudiante {
    private String numeroIdentificacion;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private int edad;

    public Estudiante(String numeroIdentificacion, String nombres, String apellidos, String correo, String telefono, int edad){
        this.numeroIdentificacion=numeroIdentificacion;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.correo=correo;
        this.telefono=telefono;
        this.edad=edad;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante [numeroIdentificacion=" + numeroIdentificacion + ", nombres=" + nombres + ", apellidos="
                + apellidos + ", correo=" + correo + ", telefono=" + telefono + ", edad=" + edad + "]";
    }
    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }
    
}
