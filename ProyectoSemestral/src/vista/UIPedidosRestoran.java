package vista;

import java.util.Scanner;

public class UIPedidosRestoran {
    private static UIPedidosRestoran instancia = null;

    private UIPedidosRestoran(){

    }

    public static UIPedidosRestoran getInstancia() {return instancia;}

    public void menuPrincipal(){
        Scanner tec = new Scanner(System.in);
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
        while(valido==false){
            if(opcion>0 && opcion<=10){
                valido = true;
            } else {
                System.out.println("Opción ingresada no es valida, ingrese nuevamente: ");
                opcion = tec.nextInt();
            }

        }





    }


}
