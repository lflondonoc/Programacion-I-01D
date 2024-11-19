package co.edu.uniquindio.poo;

public class NotificacionSMS implements INotificacion {
    private String telefono;

    public NotificacionSMS(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public EstadoNoticia enviar(String mensaje) {
        System.out.println("Enviando SMS a " + telefono + ": " + mensaje);
        return EstadoNoticia.ENVIADA;
    }
}
