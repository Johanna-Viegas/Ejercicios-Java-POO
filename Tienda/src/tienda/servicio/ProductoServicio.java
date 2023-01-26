/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicio;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import tienda.entidad.Producto;
import tienda.persistencia.ProductoDaoExt;

/**
 *
 * @author Windows 10
 */
public class ProductoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ProductoDaoExt PDAOE = new ProductoDaoExt();
    
    
    
    
    public void menu() throws Exception{
    Integer rta = 1;
    Collection<Producto> productos = new ArrayList();
    do{
            System.out.println("----------MENU----------");
            System.out.println("1) Lista el nombre de todos los productos que hay en la tabla producto.");
            System.out.println("2) Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3) Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4) Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5) Listar el nombre y el precio del producto más barato.");
            System.out.println("6) Ingresar un producto a la base de datos.");
            System.out.println("7) Ingresar un fabricante a la base de datos");
            System.out.println("8) Editar un producto con datos a elección.");
            System.out.println("");
            rta = leer.nextInt();
            switch(rta){
                case 1:
                    productos = PDAOE.buscarTodo1();

                           for (Producto producto : productos) {
                              System.out.println("Nombre: " + producto.getNombre());
                              System.out.println("");
                            }          
    
                    break;
                case 2:
                    productos = PDAOE.buscarTodo2();
                    for (Producto producto : productos) {
                              System.out.println("Nombre: " + producto.getNombre());
                              System.out.println("Precio: " + producto.getPrecio());
                              System.out.println("");
                            }          
                    break;
                case 3:
                    productos = PDAOE.buscar3();
                    for (Producto producto : productos) {
                              System.out.println("Nombre: " + producto.getNombre());
                              System.out.println("Precio: " + producto.getPrecio());
                              System.out.println("");
                            }      
                    break;
                case 4:
                    productos = PDAOE.buscar4();
                    for (Producto producto : productos) {
                              System.out.println("Nombre: " + producto.getNombre());
                              System.out.println("Precio: " + producto.getPrecio());
                              System.out.println("");
                            }      
                    break;
                case 5:
                    Producto producto = PDAOE.buscar5();
                              System.out.println("Nombre: " + producto.getNombre());
                              System.out.println("Precio: " + producto.getPrecio());
                              System.out.println("");
                    break;
                case 6:
                                    
                    PDAOE.buscar6();
                    break;
                case 7:
                    System.out.println("Idem a buscar 6");
                    break;
                case 8:
                    PDAOE.buscar6();
                    break;
            }
    } while (rta>=1 && rta<=8);
        System.out.println("SALIENDO DEL PROGRAMA...");
    }
    
    public void imprimirProductos(Collection<Producto> productos){
        for (Producto producto : productos) {
            System.out.println("Codigo: " + producto.getCodigo());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cod. Fabricante: " + producto.getCodigoFabricante());
            System.out.println("");
        }          
    }
}
