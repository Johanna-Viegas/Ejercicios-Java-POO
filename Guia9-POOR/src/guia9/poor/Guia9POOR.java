/*
 Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.
 */
package guia9.poor;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.Servicio;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia9POOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servicio servicio = new Servicio();

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        servicio.crearPerro();
        
        servicio.crearPersona();
       
       servicio.mostrarPersonas();

        
    }
    
}
