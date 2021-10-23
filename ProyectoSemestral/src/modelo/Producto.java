package modelo;

public class Producto {
    private int codigo;
    private String nombre;
    private int precioCosto, margenVentas, stock;

    public Producto(int cod, String nom, int costo, int margen) {
        this.codigo = cod;
        nombre = nom;
        precioCosto = costo;
        margenVentas = margen;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecioVenta(){
        return 0;
    }

    public void addLineaPedido(LineaPedido linea){

    }

    public int getNroLineasPedidos(){
        return 0;
    }

    public void addStock(int nroUnidades){

    }

    public boolean removeStock(int nroUnidades){
        return false;
    }

    public boolean equals(Producto other){
        return false;
    }

    public String toString(){
        return null;
    }


}
