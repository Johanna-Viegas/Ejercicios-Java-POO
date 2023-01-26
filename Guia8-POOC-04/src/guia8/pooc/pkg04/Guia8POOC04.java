/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package guia8.pooc.pkg04;

import Comparadores.Comparador;
import Entidad.Pelicula;
import Servicio.ServicioPelicula;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class Guia8POOC04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPelicula servicio = new ServicioPelicula();
        
        // Realizamos bucle para incorporar peliculas
        String rta;
        do{
            servicio.crearPelicula();
            System.out.println("Desea incorporar una Pelicula S/N");
            rta = leer.next();
        } while(rta.equalsIgnoreCase("S"));
        
        servicio.mostrarPeliculas();
        
        servicio.mostrarPeliculasMasHora();
        
        servicio.ordenarPorDuracionDes();
        
        System.out.println("---- Peliculas ordenadas de mayor a menor duración ----");
        
        servicio.mostrarPeliculas();
        
        servicio.ordenarPorDuracionAs();
        
        System.out.println("---- Peliculas ordenadas de menor a mayor duración ----");
        
        servicio.mostrarPeliculas();
        
        servicio.ordenarPorTitulo();
        
        System.out.println("---- Peliculas ordenadas por Título ----");
        
        servicio.mostrarPeliculas();
        
        servicio.ordenarPorDirector();
        
        System.out.println("---- Peliculas ordenadas por Director ----");
        
        servicio.mostrarPeliculas();
        
    }
    
}
