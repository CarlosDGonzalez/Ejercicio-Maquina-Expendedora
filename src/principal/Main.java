/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.Scanner;
/**
 *Programa que simula el funcionamiento de una maquina expendedora
 * @author Carlos
 * UDEC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**Declaracion de variables*/
        float totalGanancias;
        float porcentajeTotal;
        int opc;
        
        /**Declaracion para leer datos*/
        Scanner leer = new Scanner(System.in);//funcion para escanear el dato del usuario
        
        //Declaracion de los objetos
        Producto producto1 = new Producto("Papas", 2000, 30);
        Producto producto2 = new Producto("Galletas", 1000, 10);
        Producto producto3 = new Producto("Cheetos", 2000, 10);
        Producto producto4 = new Producto("Chocorramo", 1500, 20);
        Producto producto5 = new Producto("Vacio", 0, 0);
        Producto producto6 = new Producto("Vacio", 0, 0);
        
        titulo();
        do{//repeticion del menu de opciones
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Productos.");
        System.out.println("1.Papas.");
        System.out.println("2.Galletas.");
        System.out.println("3.Cheetos.");
        System.out.println("4.Chocorramo.");
        System.out.println("5."+producto5.nombre);
        System.out.println("6."+producto6.nombre);
        System.out.println("7.Agregar producto nuevo."); 
        System.out.println("0.Salir.");
        System.out.print("Digite el numero de la opcion que desea: ");
        
        opc = leer.nextInt();//escaneo del dato del menu del usuario
        switch(opc){
            
            case 1:
                //producto 1
                opc=0;
                 do{//repeticion del menu de opciones
                     subMenu();
                    opc = leer.nextInt();//escaneo del dato del menu del usuario
                    switch(opc){

                        case 1:
                            //metodo de la compra
                            producto1.comprar();
                            break;

                        case 2:
                            //metodo para añadir n cantidad de productos
                            producto1.cantidad();
                           break;

                        case 3:
                            //metodo para ver el numero y % de ventas del producto
                            producto1.verCantidadVentas();
                           break;

                        case 4:
                            //metodo para ver el total y % de ganancias del prodcuto.
                            producto1.verGanancias();
                            totalGanancias = 0;
                            totalGanancias = (float)(producto1.ganancias+producto2.ganancias+producto3.ganancias+producto4.ganancias+producto5.ganancias+producto6.ganancias);
                            porcentajeTotal = ((producto1.ganancias*100)/totalGanancias);
                            System.out.println("El porcentaje de ganancias del producto es del: %"+porcentajeTotal);
                           break;

                        case 5:
                            //salida del menu.
                            break;
                        default:
                            //opcion no valida del menu.
                            System.out.println("La opcion no es valida.");
                            break;
                    }

                    }while(opc!=5);
                break;
            
            case 2:
                //producto 2
                opc=0;
                 do{//repeticion del menu de opciones
                    subMenu();
                    opc = leer.nextInt();//escaneo del dato del menu del usuario
                    switch(opc){

                        case 1:
                            //metodo de la compra
                            producto2.comprar();
                            break;

                        case 2:
                            //metodo para añadir n cantidad de productos
                            producto2.cantidad();
                           break;

                        case 3:
                            //metodo para ver el numero y % de ventas del producto
                            producto2.verCantidadVentas();
                           break;

                        case 4:
                            //metodo para ver el total y % de ganancias del prodcuto.
                            producto2.verGanancias();
                            totalGanancias = 0;
                            totalGanancias = (float)(producto1.ganancias+producto2.ganancias+producto3.ganancias+producto4.ganancias+producto5.ganancias+producto6.ganancias);
                            porcentajeTotal = ((producto2.ganancias*100)/totalGanancias);
                            System.out.println("El porcentaje de ganancias del producto es del: %"+porcentajeTotal);
                           break;

                        case 5:
                            //salida del menu.
                            break;
                        default:
                            //opcion no valida del menu.
                            System.out.println("La opcion no es valida.");
                            break;
                    }

                    }while(opc!=5);
              
               break;
               
            case 3:
                //producto 3
                opc=0;
                 do{//repeticion del menu de opciones
                    subMenu();
                    opc = leer.nextInt();//escaneo del dato del menu del usuario
                    switch(opc){

                        case 1:
                            //metodo de la compra
                            producto3.comprar();
                            break;

                        case 2:
                            //metodo para añadir n cantidad de productos
                            producto3.cantidad();
                           break;

                        case 3:
                            //metodo para ver el numero y % de ventas del producto
                            producto3.verCantidadVentas();
                           break;

                        case 4:
                            //metodo para ver el total y % de ganancias del prodcuto.
                            producto3.verGanancias();
                            totalGanancias = 0;
                            totalGanancias = (float)(producto1.ganancias+producto2.ganancias+producto3.ganancias+producto4.ganancias+producto5.ganancias+producto6.ganancias);
                            porcentajeTotal = ((producto3.ganancias*100)/totalGanancias);
                            System.out.println("El porcentaje de ganancias del producto es del: %"+porcentajeTotal);
                           break;

                        case 5:
                            //salida del menu.
                            break;
                        default:
                            //opcion no valida del menu.
                            System.out.println("La opcion no es valida.");
                            break;
                    }

                    }while(opc!=5);
               
               break;
               
            case 4:
                //producto 4
                opc=0;
                 do{//repeticion del menu de opciones
                    subMenu();
                    opc = leer.nextInt();//escaneo del dato del menu del usuario
                    switch(opc){

                        case 1:
                            //metodo de la compra
                            producto4.comprar();
                            break;

                        case 2:
                            //metodo para añadir n cantidad de productos
                            producto4.cantidad();
                           break;

                        case 3:
                            //metodo para ver el numero y % de ventas del producto
                            producto4.verCantidadVentas();
                           break;

                        case 4:
                            //metodo para ver el total y % de ganancias del prodcuto.
                            producto4.verGanancias();
                            totalGanancias = 0;
                            totalGanancias = (float)(producto1.ganancias+producto2.ganancias+producto3.ganancias+producto4.ganancias+producto5.ganancias+producto6.ganancias);
                            porcentajeTotal = ((producto4.ganancias*100)/totalGanancias);
                            System.out.println("El porcentaje de ganancias del producto es del: %"+porcentajeTotal);
                           break;

                        case 5:
                            //salida del menu.
                            break;
                        default:
                            //opcion no valida del menu.
                            System.out.println("La opcion no es valida.");
                            break;
                    }

                    }while(opc!=5);
              
               break;
               
            case 5:
                //producto 5
                if(producto5.nombre=="Vacio"){
                    System.out.println("El producto no ha sido agregado.");
                }else{
                
                opc=0;
                 do{//repeticion del menu de opciones
                    subMenu();
                    opc = leer.nextInt();//escaneo del dato del menu del usuario
                    switch(opc){

                        case 1:
                            //metodo de la compra
                            producto5.comprar();
                            break;

                        case 2:
                            //metodo para añadir n cantidad de productos
                            producto5.cantidad();
                           break;

                        case 3:
                            //metodo para ver el numero y % de ventas del producto
                            producto5.verCantidadVentas();
                           break;

                        case 4:
                            //metodo para ver el total y % de ganancias del prodcuto.
                            producto5.verGanancias();
                            totalGanancias = 0;
                            totalGanancias = (float)(producto1.ganancias+producto2.ganancias+producto3.ganancias+producto4.ganancias+producto5.ganancias+producto6.ganancias);
                            porcentajeTotal = ((producto5.ganancias*100)/totalGanancias);
                            System.out.println("El porcentaje de ganancias del producto es del: %"+porcentajeTotal);
                           break;

                        case 5:
                            //salida del menu.
                            break;
                        default:
                            //opcion no valida del menu.
                            System.out.println("La opcion no es valida.");
                            break;
                    }

                    }while(opc!=5);
                    }
                break;
            case 6:
                //producto 6
                if(producto6.nombre=="Vacio"){
                    System.out.println("El producto no ha sido agregado.");
                }else{
                
                opc=0;
                 do{//repeticion del menu de opciones
                    subMenu();
                    opc = leer.nextInt();//escaneo del dato del menu del usuario
                    switch(opc){

                        case 1:
                            //metodo de la compra
                            producto6.comprar();
                            break;

                        case 2:
                            //metodo para añadir n cantidad de productos
                            producto6.cantidad();
                           break;

                        case 3:
                            //metodo para ver el numero y % de ventas del producto
                            producto6.verCantidadVentas();
                           break;

                        case 4:
                            //metodo para ver el total y % de ganancias del prodcuto.
                            producto6.verGanancias();
                            totalGanancias = 0;
                            totalGanancias = (float)(producto1.ganancias+producto2.ganancias+producto3.ganancias+producto4.ganancias+producto5.ganancias+producto6.ganancias);
                            porcentajeTotal = ((producto6.ganancias*100)/totalGanancias);
                            System.out.println("El porcentaje de ganancias del producto es del: %"+porcentajeTotal);
                           break;

                        case 5:
                            //salida del menu.
                            break;
                        default:
                            //opcion no valida del menu.
                            System.out.println("La opcion no es valida.");
                            break;
                    }

                    }while(opc!=5);
                    }
                break;
                
            case 7:
                if(producto5.nombre=="Vacio"||producto6.nombre=="Vacio"){
                    if(producto5.nombre=="Vacio"){
                        producto5.agregarProducto();
                    }else{
                        producto6.agregarProducto();
                    }
                  }else{
                    System.out.println("No se pueden agregar mas productos.");
                }
                break;
            case 0:
                System.out.println("Adios");
                break;
            default:
                //opcion no valida del menu.
                System.out.println("La opcion no es valida.");
                break;
                        
        }
        
        }while(opc!=0);
       
    }
    /**
     * Metodo para la impresion del menu de los productos.
     */
    static void subMenu(){
        System.out.println("Opciones del Producto.");
        System.out.println("1.Comprar.");
        System.out.println("2.Añadir cantidad.");
        System.out.println("3.Ver Cantidad Ventas.");
        System.out.println("4.Ver Cantidad Ganancias.");
        System.out.println("5.Regresar.");
        System.out.print("Digite el numero de la opcion que desea: ");
    }
    //Void para dar un inicio visual
    public static void titulo(){
        System.out.println("#### ##    ## ####  ######  ####  ####### ");
        System.out.println(" ##  ###   ##  ##  ##    ##  ##  ##     ##");
        System.out.println(" ##  ####  ##  ##  ##        ##  ##     ##");
        System.out.println(" ##  ## ## ##  ##  ##        ##  ##     ##");
        System.out.println(" ##  ##  ####  ##  ##        ##  ##     ##");
        System.out.println(" ##  ##   ###  ##  ##    ##  ##  ##     ##");
        System.out.println("#### ##    ## ####  ######  ####  #######");
    }
}






