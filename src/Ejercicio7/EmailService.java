package Ejercicio7;

public class EmailService implements NotificacionService {
    @Override
    public void enviarNotificacion(String mensaje, String correo) {
        System.out.println("Correo enviado a "+ correo +" con el mensaje: " + mensaje);
    }
}
