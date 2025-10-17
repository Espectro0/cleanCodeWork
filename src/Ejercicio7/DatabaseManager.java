package Ejercicio7;

public class DatabaseManager implements ReservaRepository {
    @Override
    public void guardar(Reserva reserva) {
        System.out.println("Guardando reserva en la base de datos...");
    }
}
