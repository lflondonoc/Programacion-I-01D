package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        
        Cliente cliente= new Cliente("Juan", "123", "27", "juan@gmail.com");

        Empleado empleado = new Empleado("Pedro", "456", "40", 0);

        Persona.mostrarMensaje(cliente.toString());
        
    }
}
