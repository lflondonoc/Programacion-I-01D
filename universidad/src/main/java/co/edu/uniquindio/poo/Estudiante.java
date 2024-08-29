package co.edu.uniquindio.poo;

public class Estudiante {
    private String numeroIdentificacion;
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;

    public Estudiante(String numeroIdentificacion, String nombres, String apellidos, String correo, String telefono, int edad, double nota1, double nota2, double nota3, double nota4, double nota5){
        this.numeroIdentificacion=numeroIdentificacion;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.correo=correo;
        this.telefono=telefono;
        this.edad=edad;
        this.nota1=nota1;
        this.nota2=nota2;
        this.nota3=nota3;
        this.nota4=nota4;
        this.nota5=nota5;
        assert !numeroIdentificacion.isBlank();
        assert !nombres.isBlank();
        assert !apellidos.isBlank();
        assert !correo.isBlank();
        assert !telefono.isBlank();
        assert edad>0;
        assert correo.contains("@");


    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
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
        return "El estudiante es:\n - " + numeroIdentificacion + ", " + nombres + ", "
                + apellidos + ", " + correo + ", " + telefono + ", " + edad + ", " + nota1
                + ", " + nota2 + ", " + nota3 + ", " + nota4 + ", " + nota5+" su definitiva es de: "+calcularDefinitiva(nota1, nota2, nota3, nota4, nota5);
    }
    

    public double calcularDefinitiva (double nota1, double nota2, double nota3, double nota4, double nota5){
        double definitiva= (nota1+nota2+nota3+nota4+nota5)/5;
        return Math.round(definitiva*10.0)/10.0;
    }
    
}
