/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia8.pooc.pkg06;

import Servicio.ServicioTienda;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia8POOC06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioTienda servicio = new ServicioTienda();
        
        String rta;
        int i = 0;
        do{
            
            servicio.crearProducto(i);
            System.out.println("Queres ingresar otro producto? S/N");
            rta = leer.next();
            i +=1;
        } while (rta.equalsIgnoreCase("s"));
        
        servicio.motrarProductos();
        

        
        servicio.eliminarProducto();
        
        servicio.motrarProductos();
        
        
    }
    
}
