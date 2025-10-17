package Ejercicio1;

public class NotificacionPush implements Notificacion {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por Push: " + mensaje);
    }
}
