/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cine;
import Entidad.Espectador;
import Entidad.Pelicula;
import Entidad.Sala;
import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class ServicioCine {
    
    ArrayList<Pelicula> peliculas = new ArrayList<>();
    ArrayList<Sala> salas = new ArrayList<>();
    ArrayList<Espectador> espectadores = new ArrayList<>();
    
    
    public Cine crearCine(){
        ServicioPelicula servPel = new ServicioPelicula();
        peliculas = servPel.crearPeliculas();
        ServicioSala servSala = new ServicioSala();
        salas = servSala.crearSalas( peliculas);
        ServicioEspectador servEsp = new ServicioEspectador();
        espectadores= servEsp.crearEspectadores();
        Cine cine = new Cine(salas, peliculas,300, 320, 500, espectadores);
        return cine;
    }
}
