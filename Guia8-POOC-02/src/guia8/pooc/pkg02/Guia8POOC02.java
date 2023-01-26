/*
 En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package guia8.pooc.pkg02;

import Servicio.ServicioAlumno;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia8POOC02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        ServicioAlumno servicio = new ServicioAlumno();
        
        //Creo el menu en un bucle 
        String rta;
        do{
            servicio.crearAlumno();
            System.out.println("Desea ingresar otro Alumno? S/N");
            rta= leer.next();
            
        } while (rta.equals("S"));
        
        //Nota final, pedimos el nombre 
        System.out.println("Que alumno quiere promediar?");
        String alumnoFinal = leer.next();
        servicio.checkAlumno(alumnoFinal);
    }
    
}
