package Ejercicio3;

public class EmpleadoTodero {
    private Cajero cajero;
    private Cocinero cocinero;
    private Tendero tendero;

    public EmpleadoTodero() {
        this.cajero = new Cajero();
        this.cocinero = new Cocinero();
        this.tendero = new Tendero();
    }

    public void cocinar() {
        cocinero.prepararComida();
    }

    public void tenderar() {
        tendero.atenderCliente();
    }

    public void cobrar() {
        cajero.cobrar();
    }

}
