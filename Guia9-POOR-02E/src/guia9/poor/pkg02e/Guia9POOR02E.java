/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9.poor.pkg02e;

import Entidad.Cine;
import Servicio.ServicioCine;
import Servicio.ServicioPelicula;
import Servicio.ServicioSala;

/**
 *
 * @author Windows 10
 */
public class Guia9POOR02E {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCine servCine = new ServicioCine();
        Cine cine = servCine.crearCine();
        
        System.out.println("------------ PELICULAS EN CARTELERA ------------");
        ServicioPelicula servPeli= new ServicioPelicula();
        servPeli.mostrarCartelera(cine);
        
        System.out.println("");
        System.out.println("------------ APERTURA ------------");
        ServicioSala servSala = new ServicioSala();
        servSala.llenarSala( cine);
        
        System.out.println("");
        System.out.println("------------ FIN DEL DIA ------------");
        servSala.mostrarSalas(cine);
    }
    
}
