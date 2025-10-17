package Ejercicio7;

public class Reserva {
    private Usuario usuario;
    private String tipoHabitacion;

    public Reserva(Usuario usuario, String tipoHabitacion) {
        this.usuario = usuario;
        this.tipoHabitacion = tipoHabitacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }
}

