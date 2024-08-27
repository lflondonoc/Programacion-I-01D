package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("1234", "Julio Cesar", "Lopez lopez", "jc@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 4.0,2.9);

        Estudiante estudiante2 = new Estudiante("567", "Juliana", "Gomez", "jg@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 1.0,2.9);

        Estudiante estudiante3 = new Estudiante("1234", "Ana", "Duarte", "ad@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 3.0,2.9);

        Profesor profesor= new Profesor("Luisa", "00000");

        Curso curso= new Curso("Programación 1", profesor);

        curso.agregarEstudiante(estudiante);
        curso.agregarEstudiante(estudiante2);
        curso.agregarEstudiante(estudiante3);

         Curso.mostrarMensaje(curso.toString());

    }
    

       
}
