/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Comparadores;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Windows 10
 */
public class Comparador {
    
    public static Comparator<Pelicula> porDuracionDes = (Pelicula p1, Pelicula p2) -> p2.getDuracion().compareTo(p1.getDuracion());

    /*
    public static Comparator<Pelicula> porDuracionDes = new Comparator<Pelicula>() {
        @Override
        public double compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    */
    
    public static Comparator<Pelicula> porDuracionAs = (Pelicula p1, Pelicula p2) -> p1.getDuracion().compareTo(p2.getDuracion());
    
    public static Comparator<Pelicula> porTituloAlf = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
        public static Comparator<Pelicula> porDirectorAlf = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDirector().compareTo(t1.getDirector());
        }
    };
}

