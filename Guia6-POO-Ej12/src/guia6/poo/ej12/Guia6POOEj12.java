/*
 Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
• Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
• Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
• Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
• Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package guia6.poo.ej12;

import Entidad.Persona;
import Servicio.ServicioPersona;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia6POOEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioPersona p = new ServicioPersona();
        Persona per = p.crearPersona();
        System.out.println(per);
        int edad= p.calcularEdad(per);
        System.out.println("Edad: " + edad);
        System.out.println("ingresar edad aleatoria");
        int edadA = leer.nextInt();
        System.out.println("La edad aleatoria es menor que la de la persona: " + p.menorQue(edadA, edad));
        p.mostrarPersona(per);
    
    }
    
}
