package co.edu.uniquindio.poo;

public class NotificacionEmail implements INotificacion{
    private String email;

    public NotificacionEmail(String email) {
        this.email = email;
    }

    @Override
    public EstadoNoticia enviar(String mensaje) {
        System.out.println("Enviando email a " + email + ": " + mensaje);
        return EstadoNoticia.ENVIADA;
    }
}
