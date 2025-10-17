package Ejercicio8;

public class Service {
    private Logger logger;

    public Service(Logger logger) {
        this.logger = logger;
    }

    public void ejecutarTarea() {
        try {
            logger.debug("Iniciando Tarea...");

            int resultado = 10 / 0; // Simulando una tarea errada para probar el logger error

        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

}
