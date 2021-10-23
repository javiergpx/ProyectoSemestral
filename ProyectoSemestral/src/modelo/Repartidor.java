package modelo;

public class Repartidor {
    private String rut, nombre, direccion, telefono;

    public Repartidor(String rut, String nom, String dom, String tel) {
        this.rut = rut;
        nombre = nom;
        direccion = dom;
        telefono = tel;
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void addPedido(Pedido pedido){

    }

    public Pedido[] getPedidosARepartir(){
        return null;
    }

    public boolean equals(Repartidor other){
        return false;
    }

    public String toString(){
        return null;
    }
}
