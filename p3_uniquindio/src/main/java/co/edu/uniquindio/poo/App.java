package co.edu.uniquindio.poo;

import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Crear universidad
        Universidad universidad = new Universidad("Universidad del Quindío");

        // Crear notificaciones
        universidad.agregarNotificacion(new NotificacionEmail("correo@uq.edu.co"));
        universidad.agregarNotificacion(new NotificacionSMS("123456789"));
        universidad.agregarNotificacion(new NotificacionPush("dispositivo_001"));

        // Crear noticias
        Noticia noticia1 = new Noticia("Evento académico", "Se realizará un congreso de tecnología.",
                Arrays.asList("evento", "tecnología", "academia"));
        Noticia noticia2 = new Noticia("Vacaciones", "Las vacaciones de fin de año inician el 15 de diciembre.",
                Arrays.asList("vacaciones", "año", "fin"));
        Noticia noticia3 = new Noticia("Nuevo evento deportivo", "Torneo de fútbol interfacultades.",
                Arrays.asList("evento", "deporte", "fútbol"));
        noticia2.actualizarEstado(EstadoNoticia.ENVIADA); // Cambiamos el estado de una noticia

        universidad.agregarNoticia(noticia1);
        universidad.agregarNoticia(noticia2);
        universidad.agregarNoticia(noticia3);

        // Consultar noticias pendientes por palabra clave
        String palabraClave = "evento";
        List<Noticia> noticiasPendientes = universidad.consultarNoticiasPendientesPorPalabraClave(palabraClave);

        // Consultar Noticias Pendientes
        System.out.println("Noticias pendientes con la palabra clave '" + palabraClave + "':");
        for (Noticia noticia : noticiasPendientes) {
            System.out.println("- " + noticia.getTitulo());
        }

        // Buscar la etiqueta más usada
        String etiquetaMasUsada = universidad.buscarEtiquetaMasUsada();
        System.out.println("La etiqueta más usada es: " + etiquetaMasUsada);
    }

}