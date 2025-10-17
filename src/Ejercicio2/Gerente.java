package Ejercicio2;

public class Gerente extends Empleado {
    public Gerente(String nombre, double salario) {
        super(nombre, "Gerente", salario);
    }

    @Override
    public double calcularBono() {
        return getSalario() * 0.5;
    }
}
