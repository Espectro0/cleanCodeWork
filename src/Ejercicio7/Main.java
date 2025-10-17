package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        ReservaRepository repo = new DatabaseManager();
        NotificacionService mail = new EmailService();
        ReservaController controller = new ReservaController(repo, mail);

        Usuario user = new Usuario("Jhon Doe", "jhon.doe@example.com", "3214567890");
        controller.crearReserva(new Reserva(user, "Suite"));
    }
}