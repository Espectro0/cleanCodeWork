package Ejercicio7;

public class ReservaController {
    private ReservaRepository reservaRepository;
    private NotificacionService notificacionService;

    public ReservaController(ReservaRepository reservaRepository, NotificacionService notificacionService) {
        this.reservaRepository = reservaRepository;
        this.notificacionService = notificacionService;
    }

    public void crearReserva(Reserva reserva) {
        System.out.println("Creando reserva...");
        reservaRepository.guardar(reserva);
        notificacionService.enviarNotificacion("Reserva Creada", reserva.getUsuario().getEmail());
    }
}
