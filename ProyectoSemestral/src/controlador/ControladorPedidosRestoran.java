package controlador;

import vista.UIPedidosRestoran;

public class ControladorPedidosRestoran {
    private static ControladorPedidosRestoran instancia = null;

    private ControladorPedidosRestoran(){

    }

    public static ControladorPedidosRestoran getInstancia() {return instancia;}


    public int addPedido(String rutCliente, String[][] datosProductos){
        return 0;
    }

    public void addCliente(String rut, String nombre, String domicilio, String telefono){

    }

    public void addRepartidor(String rut, String nom, String dom, String tel){

    }

    public void addProductoBasico(int cod, String nombre, int precioCosto, int margenVenta){

    }

    public void addStockAProducto(int codigo, int nroUnidades){

    }

    public void setRepartidorAPedido(String rut, int cod){

    }

    public void setEntregaPedido(int cod){

    }

    public String[][] listProductos(){
        return null;
    }

    public String[][] listRepartidores(){
        return null;
    }

    public String[][] listPedidosPendientes(String rutCliente){
        return null;
    }

    public String[][] listPedidosPorEntregar(String rutRepartidor){
        return null;
    }

    public String[][] listProductosMasSolicitados(int nroPedidosMin){
        return null;
    }

    public String[] getDatosCliente(String rut){
        return null;
    }

    public String[] getDatosProducto(int codigo){
        return null;
    }

    public String[] getDatosRepartidor(String rut){
        return null;
    }



}

