package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Service consoleService = new Service(consoleLogger);

        consoleService.ejecutarTarea();

        System.out.println();


        Logger fileLogger = new FileLogger();
        Service fileService = new Service(fileLogger);

        fileService.ejecutarTarea();

        System.out.println();

        Logger databaseLogger = new DatabaseLogger();
        Service databaseService = new Service(databaseLogger);

        databaseService.ejecutarTarea();


    }
}
