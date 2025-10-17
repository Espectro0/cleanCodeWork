package Ejercicio2;

public abstract class Empleado {
    protected String nombre;
    private String tipo;
    protected double salario;

    public Empleado(String nombre,  String tipo, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularBono();

    public Double getSalario() {
        return salario;
    }
}
