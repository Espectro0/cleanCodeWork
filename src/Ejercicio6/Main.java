package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.addItem(new Item("Hamburguesa", 15000, 2));
        pedido.addItem(new Item("Papas Fritas", 3000, 1));
        pedido.addItem(new Item("Refresco", 2500, 2));

        PedidoController pedidoController = new PedidoController();

        pedidoController.mostrarTotal(pedido);
    }
}
