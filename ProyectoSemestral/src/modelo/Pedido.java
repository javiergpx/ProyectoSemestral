package modelo;

import java.time.LocalDate;

public class Pedido extends Object {
    private int numero;
    private LocalDate fecha;
    private Estado estado;

    public Pedido(int nro, LocalDate fecha, Cliente cliente) {
        numero = nro;
        this.fecha = fecha;

    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public Cliente getCliente(){
        return null;
    }

    public Repartidor getRepartidor(){
        return null;
    }

    public void addProducto(Producto producto, int cantidad){

    }

    public int getMontoTotal(){
        return 0;
    }

    public void setRepartidor(Repartidor repartidor){

    }

    public void setEntregado(){
        estado = Estado.ENTREGADO;
    }

}
