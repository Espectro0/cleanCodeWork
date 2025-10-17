package Ejercicio8;

public class FileLogger implements Logger {
    @Override
    public void debug(String message) {
        System.out.println("File [ DEBUG ]: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("File [ ERROR ]: " + message);
    }
}
