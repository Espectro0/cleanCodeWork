package Ejercicio8;

public class ConsoleLogger implements  Logger {
    @Override
    public void debug(String message) {
        System.out.println("Console [ DEBUG ]: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("Console [ ERROR ]: " + message);
    }
}
