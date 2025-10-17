package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Notificacion email = new NotificacionEmail();
        Notificacion sms = new NotificacionSMS();
        Notificacion push = new NotificacionPush();

        String mensaje = "Este es un mensaje de prueba.";

        email.enviarNotificacion(mensaje);
        sms.enviarNotificacion(mensaje);
        push.enviarNotificacion(mensaje);

    }
}
