/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class Sala {
    
    private String posiciones[][];
    private Pelicula pelicula;
    

    public Sala() {
    }

    public Sala(String[][] posiciones, Pelicula pelicula) {
        this.posiciones = posiciones;
        this.pelicula = pelicula;


    }

    public String[][] getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(String[][] posiciones) {
        this.posiciones = posiciones;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }




    
    
}
