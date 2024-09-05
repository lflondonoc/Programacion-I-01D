package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Se crea el gimnasio
        Gimnasio gimnasio = new Gimnasio("Bodytech", LocalDate.now());

        // Se crean los miembros
        Miembro miembro1 = new Miembro("Carlos", 20, "Masculino", "12345", Membresia.MENSUAL);
        Miembro miembro2 = new Miembro("Mario", 17, "Masculino", "1235", Membresia.ANUAL);

        // Se crean los entrenadores
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
        gimnasio.listaNombresInverso();

        // Obtener los miembros menores de edad
        LinkedList<Miembro> menores = gimnasio.miembrosMenoresEdad();

        // Imprimir los miembros menores de edad
        System.out.println("Miembros menores de edad: ");
        for (Miembro miembro : menores) {
            System.out.println(miembro);
        }

        Gimnasio.mostrarMensaje(gimnasio.toString());

    }
}