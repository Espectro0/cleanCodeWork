package Ejercicio1;

public class NotificacionEmail implements Notificacion {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por Email: " + mensaje);
    }
}
