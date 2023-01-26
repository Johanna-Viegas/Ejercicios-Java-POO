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
public class Cine {
    
    private ArrayList<Sala> salas;
    private ArrayList<Pelicula> Peliculas;
    private Integer precioMenor;
    private Integer precioJubilado;
    private Integer precioGral;
    private ArrayList<Espectador> espectadores;

    public Cine() {
    }

    public Cine(ArrayList<Sala> salas, ArrayList<Pelicula> Peliculas, Integer precioMenor, Integer precioJubilado, Integer precioGral, ArrayList<Espectador> espectadores) {
        this.salas = salas;
        this.Peliculas = Peliculas;
        this.precioMenor = precioMenor;
        this.precioJubilado = precioJubilado;
        this.precioGral = precioGral;
        this.espectadores = espectadores;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    

    

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return Peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> Peliculas) {
        this.Peliculas = Peliculas;
    }

    public Integer getPrecioMenor() {
        return precioMenor;
    }

    public void setPrecioMenor(Integer precioMenor) {
        this.precioMenor = precioMenor;
    }

    public Integer getPrecioJubilado() {
        return precioJubilado;
    }

    public void setPrecioJubilado(Integer precioJubilado) {
        this.precioJubilado = precioJubilado;
    }

    public Integer getPrecioGral() {
        return precioGral;
    }

    public void setPrecioGral(Integer precioGral) {
        this.precioGral = precioGral;
    }

    
    
    
}
