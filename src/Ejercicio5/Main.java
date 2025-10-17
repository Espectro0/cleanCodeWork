package Ejercicio5;

public class Main {
    public static void main(String[] args) {
        VideoPlayer Dispositivo1 = new MP4();
        AudioPlayer Dispositivo2 = new MP3();

        Dispositivo1.encender();
        Dispositivo1.mostrarVideo();
        Dispositivo1.apagar();

        System.out.println("------------------------------");

        Dispositivo2.encender();
        Dispositivo2.reproducirMusica();
        Dispositivo2.apagar();
    }
}
