package Ejercicio2;

public class Desarrolador extends Empleado {
    public Desarrolador(String nombre, double salario) {
        super(nombre, "Desarrollador", salario);
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.2;
    }
}
