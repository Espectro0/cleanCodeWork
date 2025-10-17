package Ejercicio5;

public class MP4 implements VideoPlayer {
    @Override
    public void encender() {
        System.out.println("Encendiendo el MP4...");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el MP4...");
    }

    @Override
    public void mostrarVideo() {
        System.out.println("Mostrando video en el MP4...");
    }
}
