/*
 Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package guia6.poo.ej6;

import Entidad.Cafetera;
import Servicio.ServicioCafetera;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOEj6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCafetera caf = new ServicioCafetera();
        Cafetera c = caf.newCafetera();
        int rta = 0;
        do{
        System.out.println("Menu");
        System.out.println("1- Llenar Cafetera");
        System.out.println("2- Servir Taza");
        System.out.println("3- Vaciar Cafetera");
        System.out.println("4- Agregar Cafe");
        System.out.println("5- Apagar");
        rta = leer.nextInt();
        switch(rta){
            case 1:
                caf.llenarCafetera(c);
                break;
            case 2:
                System.out.println("Introducir tamaño de taza a llenar:");
                int tam = leer.nextInt();
                caf.servirTaza(tam, c);
                break;
            case 3:
                caf.vaciarCafetera(c);
                break;
            case 4:
                System.out.println("Introducir capacidad a llenar:");
                int llenado = leer.nextInt();
                caf.agregarCafe(llenado, c); 
                break;
        }
        } while (rta != 5);
    }
    
}
