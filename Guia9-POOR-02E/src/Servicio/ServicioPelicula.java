/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cine;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class ServicioPelicula {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    ArrayList<Pelicula> peliculasUbicadas = new ArrayList<>();

    
    //Pelicula(String titulo, String director, Integer edadMin, Integer duracion)
    
    public ArrayList<Pelicula> crearPeliculas(){
        Pelicula pelicula1 = new Pelicula("Crepusculo", "Stephanie Meyer", 13, 2);
        Pelicula pelicula2 = new Pelicula("Armageddon", "Michael Bay", 16, 3);
        Pelicula pelicula3 = new Pelicula("Los minions", "Kyle Balda", 0, 1);
        Pelicula pelicula4 = new Pelicula("XXX", "Desconocido", 21, 1);
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);
        
        String rta;
        System.out.println("Desea ingresar una nueva pelicula?");
        rta = leer.next();
        while (rta.equalsIgnoreCase("si")){
            System.out.println("Ingrese su titulo, director, edad minima y duracion");
            Pelicula p = new Pelicula(leer.next(), leer.next(), leer.nextInt(), leer.nextInt());
            peliculas.add(p);
            System.out.println("Desea ingresar una nueva pelicula?");
            rta = leer.next();
        }
        
        return peliculas;
    }
    
    public void mostrarCartelera(Cine cine){
        for (Pelicula pelicula : cine.getPeliculas()) {
            System.out.println("");
            System.out.println("Pelicula " + pelicula.getTitulo() + "\n Director " + pelicula.getDirector() + "\n Edad requerida " + pelicula.getEdadMin() + "\n Duracion " + pelicula.getDuracion() );
        }

    }
    
    public Pelicula asignarSala(ArrayList<Pelicula> peliculas){
        int numAzar;
        int yaUbicada = 0;
        Pelicula peliAzar;
        do{
        numAzar = (int) (Math.random()*peliculas.size()+0);
            
        yaUbicada = 0;
        peliAzar = peliculas.get(numAzar);
            for (Pelicula peliculaU : peliculasUbicadas) {
                if(peliAzar.equals(peliculaU)){
                yaUbicada = 1;
            }
            }
        } while(yaUbicada == 1);
        peliculasUbicadas.add(peliAzar);
        return peliAzar;
    }    
    
}
