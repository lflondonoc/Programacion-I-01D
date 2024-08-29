package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Curso {
    private String nombre;
    private LinkedList<Estudiante> estudiantes;
    private Profesor profesor;

    public Curso(String nombre, Profesor profesor){
        this.nombre=nombre;
        this.profesor=profesor;
        estudiantes= new LinkedList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(LinkedList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "El nombre del curso es: " + nombre + "y el profesor a cargo es: "+profesor +"y los estudiantes que pertenecen al curso son: \n\n" + estudiantes;
    }

    public static void mostrarMensaje (String mensaje){
        System.out.println(mensaje);
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void agregarEstudiante (Estudiante estudiante){
        if (validarNumeroIdentificacion(estudiante.getNumeroIdentificacion())){
            mostrarMensaje("Error, el número de identificación"+estudiante.getNumeroIdentificacion()+ "ya esta creado");
        }else{
            estudiantes.add(estudiante);
        }
    }

    public boolean validarNumeroIdentificacion (String numeroIdentificacion){
        boolean numeroIdentificacionRepetido= false;
        for (Estudiante estudiante: estudiantes){
            if (estudiante.getNumeroIdentificacion().equals(numeroIdentificacion)){
                numeroIdentificacionRepetido=true;
            }
        }
        return numeroIdentificacionRepetido;
    }

    public void eliminarEstudiante (String numeroIdentificacion){
        for (Estudiante estudiante: estudiantes){
            if (estudiante.getNumeroIdentificacion().equals(numeroIdentificacion)){
                estudiantes.remove(estudiante);
                break;
            }
        }
    }

    public void actualizarEstudiante (String correo, String telefono, String numeroIdentificacion){
        for (Estudiante estudiante: estudiantes){
            if (estudiante.getNumeroIdentificacion().equals(numeroIdentificacion)){
                estudiante.setCorreo(correo);
                estudiante.setTelefono(telefono);
                break;
            }
        }

    }

}
