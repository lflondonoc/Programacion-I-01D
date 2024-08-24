package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("1234", "Julio Cesar", "Lopez lopez", "jc@gmail.com", "93736363", 24, 2.1, 3.0, 1.8, 4.0,2.9);

         Estudiante.mostrarMensaje(estudiante.toString());

         estudiante.setNumeroIdentificacion("2422");
         Estudiante.mostrarMensaje(estudiante.getNumeroIdentificacion());

         Estudiante.mostrarMensaje(estudiante.toString());

         Estudiante.mostrarMensaje(estudiante.getNombres());

         estudiante.setNombres("Johan");

         Estudiante.mostrarMensaje(estudiante.toString());

    }
    

       
}
