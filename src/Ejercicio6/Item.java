package Ejercicio6;

public class Item {
    private String nombre;
    private Double precio;
    private Integer cantidad;

    public Item(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}
