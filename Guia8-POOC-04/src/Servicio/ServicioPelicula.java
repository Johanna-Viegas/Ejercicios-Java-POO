/*
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
package Servicio;

import Comparadores.Comparador;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioPelicula {
    
    private ArrayList<Pelicula> lista;
    private Scanner leer;

    public ServicioPelicula() {
        this.lista = new ArrayList<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }
    
    public void crearPelicula(){
        System.out.println("Título:");
        String titulo = leer.next();
        System.out.println("Director:");
        String director = leer.next();
        System.out.println("Duración (en horas):");
        Double duracion = leer.nextDouble();
        
        lista.add( new Pelicula(titulo, director, duracion));
    }
    
    //Mostrar en pantalla todas las películas.
    
    public void mostrarPeliculas(){
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula);
        }
    }
    
    //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    
    public void mostrarPeliculasMasHora(){
        System.out.println("---- Las películas de más de una hora son ----");
        for (Pelicula pelicula : lista) {
            if(pelicula.getDuracion()>1.0){
               System.out.println(pelicula); 
            } 
        }
    }
    
    //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
    //pantalla.
    
    public void ordenarPorDuracionDes(){
        Collections.sort(lista, Comparador.porDuracionDes);
    }
    
        public void ordenarPorDuracionAs(){
        Collections.sort(lista, Comparador.porDuracionAs);
    }
        
            public void ordenarPorTitulo(){
        Collections.sort(lista, Comparador.porTituloAlf);
    }
            
                public void ordenarPorDirector(){
        Collections.sort(lista, Comparador.porDirectorAlf);
    }
}
