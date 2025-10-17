package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("John", 100000);
        Empleado dev = new Desarrolador("Alice", 80000);
        Empleado asistente = new Asistente("Bob", 50000);

        System.out.println(gerente.nombre + " (Gerente) - Bono: $" + gerente.calcularBono());
        System.out.println(dev.nombre + " (Desarrollador) - Bono: $" + dev.calcularBono());
        System.out.println(asistente.nombre + " (Asistente) - Bono: $" + asistente.calcularBono());
    }
}
