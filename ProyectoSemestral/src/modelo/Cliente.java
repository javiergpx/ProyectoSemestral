package modelo;

public class Cliente extends Object {
    private String rut, nombre, direccion, telefono;

    public Cliente(String rut, String nom, String dom, String tel) {
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

    public Pedido[] getPedidosPendientes(){



        return null;
    }

    public boolean equals(Cliente other){

        if (this.rut == other.getRut()){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return getRut() + " - " + getNombre() + " - " + this.direccion + " - " + this.telefono;
    }


}
