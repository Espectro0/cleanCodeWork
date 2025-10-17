package Ejercicio4;

public class Main {
    public static void main(String[] args) {
        GestorArchivos gestorPdf = new pdfFileManager();
        GestorArchivos gestorTxt = new txtFileManager();
        GestorArchivos gestorDocx = new docxFileManager();

        String contenido = "Hola, este es el contenido del archivo.";
        String ruta = "/ruta/del/archivo/";

        gestorPdf.guardarArchivo(contenido);
        gestorTxt.guardarArchivo(contenido);
        gestorDocx.guardarArchivo(contenido);

        gestorPdf.cargarArchivo(ruta);
        gestorTxt.cargarArchivo(ruta);
        gestorDocx.cargarArchivo(ruta);

    }
}
