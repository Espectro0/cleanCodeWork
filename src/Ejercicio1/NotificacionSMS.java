package Ejercicio1;

public class NotificacionSMS implements  Notificacion {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por SMS: " + mensaje);
    }
}
