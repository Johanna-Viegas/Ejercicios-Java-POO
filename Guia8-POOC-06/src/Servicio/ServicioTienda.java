/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import Entidad.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioTienda {
    
    private HashMap<Integer,Tienda> lista;
    private Scanner leer;

    public ServicioTienda() {
        this.lista = new HashMap<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearProducto(int i){
        System.out.println("Producto: ");
        String producto = leer.next();
        System.out.println("Precio: ");
        Integer precio = leer.nextInt();
        
        lista.put(i, new Tienda (precio,producto));
    }
    
    
    /*
    Iterator<Map.Entry<Integer, String>> iterator = estudiantes.entrySet().iterator();
//
//        System.out.println("Que estudiante quiere eliminar ? ");
//        int dni = leer.nextInt();
//
//        while (iterator.hasNext()) {
//
//            Map.Entry<Integer, String> entry = iterator.next();
//
//            if (entry.getKey() == dni) {
//                iterator.remove();
//            }
    */
    public void modificarPrecio(){
        Iterator<Map.Entry<Integer,Tienda>> iterator = lista.entrySet().iterator();
        
        System.out.println("A que producto le quiere modificar el precio?");
        String productoM = leer.next();
        
        while (iterator.hasNext()) {

            Map.Entry<Integer, Tienda> entry = iterator.next();

          if (entry.getValue().getProducto().equalsIgnoreCase(productoM)) {
              System.out.println("Que precio quieres que tenga?");
              Integer precioN = leer.nextInt();
              lista.replace(entry.getKey(), new Tienda(precioN, productoM));
        } 
    }
    }
    
        /*eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
   */
        
     public void eliminarProducto(){
        Iterator<Map.Entry<Integer,Tienda>> iterator2 = lista.entrySet().iterator();
        
        System.out.println("Que producto quiere eliminar?");
        String productoE = leer.next();
        
        while (iterator2.hasNext()) {
          // Map.Entry<Integer, Tienda> it = iterator2.next();
          

            
            if (iterator2.next().getValue().getProducto().equalsIgnoreCase(productoE))
          
              iterator2.remove();
        
    }
        }
 
    

     
     public void motrarProductos(){
         for (Map.Entry<Integer, Tienda> entry : lista.entrySet()) {
             Integer key = entry.getKey();
             Tienda value = entry.getValue();
             System.out.println("Codigo: " + entry.getKey() + entry.getValue());
         }
     }
}
