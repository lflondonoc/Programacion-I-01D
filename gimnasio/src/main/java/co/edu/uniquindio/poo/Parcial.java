package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class Parcial {
    public static void main(String[] args) {

        // creación de gimnasio
        Gimnasio gimnasio = new Gimnasio("Bodytech", LocalDate.now());

        //creación entrenador
        Miembro miembro1 = new Miembro("Carlos", 20, "Masculino", "12345", Membresia.MENSUAL);
        Miembro miembro2 = new Miembro("ana", 17, "Masculino", "1235", Membresia.ANUAL);

        //creación miembros
        Entrenador entrenador = new Entrenador("Camilo", "Pesas", 311434446, "jorge@gmail.com");
        Entrenador entrenador2 = new Entrenador("Antonio", "Pesas", 1234, "jorge@gmail.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(entrenador);
        gimnasio.agregarEntrenador(entrenador2);

        // Se vinculan los miembros al entrenador
        entrenador.agregarMiembroAEntrenador(miembro2);

        Gimnasio.mostrarMensaje(gimnasio.toString());
        // --------------------Solución parcial 1------------------------
        // Punto A
        String nombreEntrenadoMaLargo= gimnasio.obtenerNombreEntrenadorMasLargo();
        gimnasio.mostrarMensaje("\nEl nombre del entrenador mas largo es: " + nombreEntrenadoMaLargo);

        // Punto B
        // Obtiene los entrenadores cuya suma de dígitos del teléfono es 30
        LinkedList<Entrenador> entrenadorTelefono = gimnasio.agregarEntrenadorConSumaTelefono30();

        // Imprime los resultados
        Gimnasio.mostrarMensaje("\nEntrenadores con teléfono cuya suma de dígitos es 30:");
        for (Entrenador entrenador3 : entrenadorTelefono) {
            Gimnasio.mostrarMensaje(entrenador3.getNombre());
        }

        // Punto C      
        // Mostrar miembros palíndromos
        LinkedList<Miembro> palindromos = gimnasio.agregarMiembrosPalindromos();
        Gimnasio.mostrarMensaje("\nMiembros con nombres palíndromos:");
        for (Miembro miembro : palindromos) {
            Gimnasio.mostrarMensaje(miembro.toString());
        }

        
    }
     

}