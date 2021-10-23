package modelo;

public class LineaPedido extends Object {
    private int cantidad;

    public LineaPedido(Pedido pedido, Producto producto, int cantidad) {
        this.cantidad = cantidad;

    }

    public int getSubtotal(){
        return 0;
    }

    public String toString(){
        return null;
    }
}
