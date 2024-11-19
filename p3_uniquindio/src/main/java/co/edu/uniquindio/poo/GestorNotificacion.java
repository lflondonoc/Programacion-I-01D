package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class GestorNotificacion {
    private List<INotificacion> notificaciones;
    private List<Noticia> noticias;

    public GestorNotificacion() {
        this.notificaciones = new LinkedList<>();
        this.noticias = new LinkedList<>();
    }

    public void agregarNotificacion(INotificacion notificacion) {
        notificaciones.add(notificacion);
    }

    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void enviarMensaje(Noticia noticia) {
        for (INotificacion notificacion : notificaciones) {
            EstadoNoticia estado = notificacion.enviar(noticia.getDescripcion());
            noticia.actualizarEstado(estado);
        }
        System.out.println("Estado final de la noticia '" + noticia.getTitulo() + "': " + noticia.getEstado());
    }
}
