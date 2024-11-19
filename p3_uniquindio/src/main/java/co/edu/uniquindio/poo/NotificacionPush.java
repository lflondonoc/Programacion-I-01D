package co.edu.uniquindio.poo;

public class NotificacionPush implements INotificacion {
    
    private String idDispositivo;

    public NotificacionPush(String idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    @Override
    public EstadoNoticia enviar(String mensaje) {
        System.out.println("Enviando notificación push al dispositivo " + idDispositivo + ": " + mensaje);
        return EstadoNoticia.ENVIADA;
    }

}
