package Ejercicio4;

public class pdfFileManager implements  GestorArchivos {
    @Override
    public void guardarArchivo(String contenido) {
        System.out.println("Guardando archivo pdf con contenido: " + contenido);
    }

    @Override
    public void cargarArchivo(String ruta) {
        System.out.println("Cargando archivo pdf desde la ruta: " + ruta);
    }
}
