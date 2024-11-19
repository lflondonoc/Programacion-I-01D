package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Universidad {
    private String nombre;
    private GestorNotificacion gestorNotificaciones;
    private List<Noticia> noticias;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.gestorNotificaciones = new GestorNotificacion();
        this.noticias = new LinkedList<>();
    }

    /**
     * PUNTO 3. Consultar Noticias Pendientes y Agruparlas por Palabra Clave en el Título: El
     * sistema debe permitir consultar todas las noticias cuyo estado sea "pendiente" y 
     * agruparlas por una palabra clave específica en el título, devolviendo una lista 
     * de noticias que contienen esa palabra en su título.
     * @param palabraClave
     * @return noticiasFiltradas
     */
    public List<Noticia> consultarNoticiasPendientesPorPalabraClave(String palabraClave) {
        List<Noticia> noticiasFiltradas = new LinkedList<>();
        for (Noticia noticia : noticias) {
            if (noticia.getEstado() == EstadoNoticia.PENDIENTE &&
                    noticia.getTitulo().toLowerCase().contains(palabraClave.toLowerCase())) {
                noticiasFiltradas.add(noticia);
            }
        }
        return noticiasFiltradas;
    }

    /**
     * PUNTO 4. Buscar la etiqueta más usada: Crear un método que devuelva la etiqueta que
     * más se repite en las noticias. Esto permitirá conocer la etiqueta más usada.
     * @return
     */
    public String buscarEtiquetaMasUsada() {
        List<String> todasEtiquetas = new LinkedList<>();
        List<String> etiquetasContadas = new LinkedList<>();
        List<Integer> conteos = new LinkedList<>();

        for (Noticia noticia : noticias) {
            todasEtiquetas.addAll(noticia.getEtiquetas());
        }

        for (String etiqueta : todasEtiquetas) {
            if (!etiquetasContadas.contains(etiqueta)) {
                etiquetasContadas.add(etiqueta);
                conteos.add(1);
            } else {
                int indice = etiquetasContadas.indexOf(etiqueta);
                conteos.set(indice, conteos.get(indice) + 1);
            }
        }

        int maxConteo = 0;
        String etiquetaMasUsada = null;
        for (int i = 0; i < etiquetasContadas.size(); i++) {
            if (conteos.get(i) > maxConteo) {
                maxConteo = conteos.get(i);
                etiquetaMasUsada = etiquetasContadas.get(i);
            }
        }
        return etiquetaMasUsada;
    }

    public void agregarNotificacion(INotificacion notificacion) {
        gestorNotificaciones.agregarNotificacion(notificacion);
    }

    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void enviarNoticias() {
        for (Noticia noticia : noticias) {
            gestorNotificaciones.enviarMensaje(noticia);
        }
    }

}
