package Ejercicio4;

public class txtFileManager implements GestorArchivos {
    @Override
    public void guardarArchivo(String contenido) {
        System.out.println("Guardando archivo txt con contenido: " + contenido);
    }

    @Override
    public void cargarArchivo(String ruta) {
        System.out.println("Cargando archivo txt desde la ruta: " + ruta);
    }
}
