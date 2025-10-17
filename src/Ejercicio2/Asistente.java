package Ejercicio2;

public class Asistente extends Empleado {
    public Asistente(String nombre, double salario) {
        super(nombre, "Asistente", salario);
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.1;
    }
}
