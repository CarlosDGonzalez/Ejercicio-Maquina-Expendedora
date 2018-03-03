/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 * @author Carlos
 * UDEC
 */

public class Producto {
    /**Declaracion de variables*/
    public String nombre;
    public float precio = 0;
    int cantidadVentas;
    int unidadesAlmacenadas;
    public float ganancias = 0;
    int unidadesAgregadas;
    Producto(){
        
    }
    /**
     * 
     */
    Producto(String nombre,float precio,int unidadesAlmacenadas ){
         this();
        this.nombre=nombre;
        this.precio=precio;
        this.ganancias=ganancias;
        this.unidadesAgregadas=unidadesAgregadas;
        this.unidadesAlmacenadas=unidadesAlmacenadas;
    }
    /**
     * Metodo para comprar una unidad del producto.
     */
    protected void comprar(){
        if(this.unidadesAlmacenadas<=0){
            System.out.println("El producto se ha agotado. Intentelo mas tarde.");
        }else{
            System.out.println("Ha comprado "+this.nombre+". Gracias por su compra.");
            this.unidadesAlmacenadas--;
            this.cantidadVentas++;
            System.out.println("La nueva cantidad de "+this.nombre+" almacenados es: "+this.unidadesAlmacenadas);
        }
    }
    /**
     * Metodo para almacenar una cantidad del producto.
     */
    protected void cantidad(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Digite la cantidad de "+this.nombre+" que desea almacenar: ");
        do{
        this.unidadesAgregadas=leer.nextInt();
        }while(this.unidadesAgregadas<0);
        this.unidadesAlmacenadas=this.unidadesAlmacenadas+this.unidadesAgregadas;
        System.out.println("La nueva cantidad de "+this.nombre+" almacenados es: "+this.unidadesAlmacenadas);
    }
    /**
     * Metodo para ver la cantidad de Ventas del producto.
     */
    protected void verCantidadVentas(){
        System.out.println("La cantidad de "+this.nombre+" vendidos es: "+this.cantidadVentas);
        System.out.println("El porcenaje de ventas es del: %"+(this.cantidadVentas*100)/(this.cantidadVentas+this.unidadesAlmacenadas));
    }
    /**
     * Metodo para ver las ganancias.
     */
    protected void verGanancias(){
        this.ganancias=this.cantidadVentas*this.precio;
        System.out.println("El total de ganancias de "+this.nombre+" vendidos es: "+this.ganancias);
        
    }
    /**
     * Metodo para agregar un producto al dispensador.
     */
    protected void agregarProducto(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        this.nombre=leer.nextLine();
        System.out.println("Precio del producto: ");
        this.precio=leer.nextFloat();
        System.out.println("Cantidad a almacenar: ");
        this.unidadesAlmacenadas=leer.nextInt();
        System.out.println("El nuevo producto ha sido añadido.");
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+" Precio: "+precio+" Cantidad Ventas: "+cantidadVentas+" Cantidad Almacenada: "+unidadesAlmacenadas+" Ganancias: "+ganancias+" Cantidad Agregada: "+unidadesAgregadas ;
    };  
}
