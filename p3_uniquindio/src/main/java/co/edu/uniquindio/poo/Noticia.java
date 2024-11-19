package co.edu.uniquindio.poo;

import java.util.List;

public class Noticia {

    private String titulo;
    private String descripcion;
    private EstadoNoticia estado;
    private List<String> etiquetas;

    public Noticia(String titulo, String descripcion, List<String> etiquetas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = EstadoNoticia.PENDIENTE;
        this.etiquetas = etiquetas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoNoticia getEstado() {
        return estado;
    }

    public void actualizarEstado(EstadoNoticia nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public List<String> getEtiquetas() {
        return etiquetas;
    }

}
