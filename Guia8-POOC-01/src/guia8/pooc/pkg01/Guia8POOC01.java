/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada
 */
package guia8.pooc.pkg01;

import Servicio.ServicioRaza;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia8POOC01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        //Linkeo el servicio
        
        ServicioRaza nuevoServicio = new ServicioRaza();
        
        //Creo el menu en un bucle 
        String rta;
        do{
            nuevoServicio.cargarRaza();
            System.out.println("Desea ingresar otra raza? S/N");
            rta= leer.next();
            
        } while (rta.equals("S"));
        
        //Imprimimos las razas        
        nuevoServicio.imprimirRazas();
        
        //Pedimos raza y la buscamos
        System.out.println("Que raza quieres eliminar?");
        String quitarRaza = leer.next();
        nuevoServicio.buscaryEliminarRaza(quitarRaza);
        
        //Imprimimos las razas        
        nuevoServicio.imprimirRazas();
        
    }
    
}
