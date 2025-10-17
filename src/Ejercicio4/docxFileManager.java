package Ejercicio4;

public class docxFileManager implements GestorArchivos {
    @Override
    public void guardarArchivo(String contenido) {
        System.out.println("Guardando archivo docx con contenido: " + contenido);
    }

    @Override
    public void cargarArchivo(String ruta) {
        System.out.println("Cargando archivo docx desde la ruta: " + ruta);
    }
}
