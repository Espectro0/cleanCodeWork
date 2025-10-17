package Ejercicio5;

public class MP3 implements AudioPlayer {
    @Override
    public void encender() {
        System.out.println("Encendiendo el MP3...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el MP3...");
    }

    public void reproducirMusica() {
        System.out.println("Reproduciendo música en el MP3...");
    }
}
