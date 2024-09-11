package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // creación de gimnasio
        Gimnasio gimnasio = new Gimnasio("Bodytech", LocalDate.now());

        //creación entrenador
        Miembro miembro1 = new Miembro("Carlos", 20, "Masculino", "12345", Membresia.MENSUAL);
        Miembro miembro2 = new Miembro("Mario", 17, "Masculino", "1235", Membresia.ANUAL);

        //creación miembros
        Entrenador entrenador = new Entrenador("Jorge", "Pesas", "1234", "jorge@gmail.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(entrenador);

        // Se vinculan los miembros al entrenador
        entrenador.agregarMiembroAEntrenador(miembro2);

        Gimnasio.mostrarMensaje(gimnasio.toString());

        // Devolver lista con nombre invertidos
        Gimnasio.mostrarMensaje("Lista Nombres Invertidos: ");
        gimnasio.imprimirNombresInvertidos();

        // Mostrar los miembros que son menores a 18 años
        Gimnasio.mostrarMensaje("Mostrar menores de 18: ");
        LinkedList<Miembro> menores= gimnasio.obtenerContactosMenoresEdad();
        for (Miembro miembro: menores){
            Gimnasio.mostrarMensaje(miembro.toString());
        }


        // Calcular promedio de edades
        double promedio = gimnasio.calcularPromedioEdades();
        Gimnasio.mostrarMensaje("El promedio de las edades es: "+promedio);

        // Obtener la edad que más se repite
        int edadMasRepetida = gimnasio.obtenerEdadMasRepetida();
        Gimnasio.mostrarMensaje("La edad que más se repite es: " + edadMasRepetida);


        // Eliminar miembros con al menos 3 vocales en el nombre
        gimnasio.eliminarMiembrosCon3Vocales();
            // Mostrar los miembros restantes
            Gimnasio.mostrarMensaje("Miembros restantes después de eliminar los nombres con 3 o más vocales:");
            Gimnasio.mostrarMensaje(gimnasio.toString());


    }
}