package vista;

import controlador.ControladorPedidosRestoran;
import jdk.swing.interop.SwingInterOpUtils;
import modelo.Cliente;
import modelo.Repartidor;

import java.util.Scanner;

public class UIPedidosRestoran {

    Scanner tec = new Scanner(System.in);
    private static UIPedidosRestoran instancia = null;

    private UIPedidosRestoran(){

    }

    public static UIPedidosRestoran getInstancia() {return instancia;}

    public void menuPrincipal(){
        System.out.println("............................................................");
        System.out.println("...........::: SISTEMA DE PEDIDOS DE RESTORÁN :::...........");
        System.out.println("");
        System.out.println("...::: MENÚ PRINCIPAL :::...");
        System.out.println("1. Crear cliente/repartidor");
        System.out.println("2. Crear producto");
        System.out.println("3. Ingresar pedido");
        System.out.println("4. Ingresar entrega pedido");
        System.out.println("5. Listar productos");
        System.out.println("6. Listar repartidores");
        System.out.println("7. Listar pedidos pendientes");
        System.out.println("8. Listar pedidos por entregar");
        System.out.println("9. Listar productos más solicitados");
        System.out.println("10. Salir \n");
        System.out.println("    Ingrese opción: ");

        int opcion = tec.nextInt();
        //validar opcion
        boolean valido = false;
        while(!valido){
            if(opcion>0 && opcion<=10){
                valido = true;
            } else {
                System.out.println("Opción ingresada no es valida, ingrese nuevamente: ");
                opcion = tec.nextInt();
            }

        }

        switch (opcion){
            case 1:
                creaClienteRepartidor();
                break;

            case 2:

                break;

        }





    }

    private void creaClienteRepartidor(){
        String rut, nombre, direccion, telefono, continuar;
        System.out.println("...::: MENÚ :::...");
        System.out.println("1. Crear Cliente");
        System.out.println("2. Crear Repartidor");
        System.out.println("     Ingrese opción: ");
        int opcionCCR = tec.nextInt();

        //validar opcion
        boolean v = false;
        while(!v){
            if(opcionCCR>0 && opcionCCR<=2){
                v = true;
            } else {
                System.out.println("Opción ingresada no es valida, ingrese nuevamente: ");
                opcionCCR = tec.nextInt();
            }

        }

        switch (opcionCCR){
            case 1:
                System.out.println("*** NUEVO CLIENTE ***");
                System.out.println("Rut: ");
                rut = tec.next();
                System.out.println("Nombre: ");
                nombre =tec.next();
                System.out.println("Dirección: ");
                direccion= tec.next();
                System.out.println("Telefono: ");
                telefono = tec.next();
                System.out.println("<<Presione enter para continuar>>");
                continuar = tec.next();
                //Patrón de diseño singleton, limita la cantidad de objetos de la clase. Se obtienen los métodos mediante instancia de la clase.
                ControladorPedidosRestoran.getInstancia().addCliente(rut, nombre, direccion, telefono);
                break;

            case 2:
                System.out.println("*** NUEVO REPARTIDOR ***");
                System.out.println("Rut: ");
                rut = tec.next();
                System.out.println("Nombre: ");
                nombre =tec.next();
                System.out.println("Dirección: ");
                direccion= tec.next();
                System.out.println("Telefono: ");
                telefono = tec.next();
                System.out.println("<<Presione enter para continuar>>");
                continuar = tec.next();
                //Patrón de diseño singleton, limita la cantidad de objetos de la clase. Se obtienen los métodos mediante instancia de la clase.
                ControladorPedidosRestoran.getInstancia().addRepartidor(rut, nombre, direccion, telefono);
                break;
        }

    }

    private void creaProducto(){
        System.out.println("*** CREACIÓN DE UN NUEVO PRODUCTO *** \n");
        System.out.println("Código: ");
        int codigo = tec.nextInt();
        System.out.println("Nombre: ");
        String nombre = tec.next();
        System.out.println("Precio de costo: ");
        int costo = tec.nextInt();
        System.out.println("Margen de venta: ");
        int margen = tec.nextInt();
        System.out.println("Stock inicial: ");
        int stock = tec.nextInt();
        System.out.println("<<Presione enter para continuar>>");
        String continuar = tec.next();
        ControladorPedidosRestoran.getInstancia().addProductoBasico(codigo, nombre, costo, margen);

    }

    private void ingresaPedidoCliente(){
        System.out.println("*** INGRESO DEUN PEDIDO ***");
        System.out.println("Rut cliente: ");
        String rut = tec.next();
        System.out.println("Nombre cliente: ");
        System.out.println("Ingrese el número de productos distintos que desea incluir: ");
        int nroProductosDistinos = tec.nextInt();
        System.out.println("Código: ");
        int codigo = tec.nextInt();
        System.out.println("Nombre");
    }
}
