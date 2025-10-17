package Ejercicio8;

public class DatabaseLogger implements Logger {
    @Override
    public void debug(String message) {
        System.out.println("Database [ DEBUG ]: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("Database [ ERROR ]: " + message);
    }
}
