package Ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    public List<Item> items;

    public Pedido() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public Double getTotal(Pedido pedido) {
        Double total = 0.0;
        for (Item item : pedido.items) {
            total += item.getPrecio() * item.getCantidad();
        }
        return total;
    }

}
