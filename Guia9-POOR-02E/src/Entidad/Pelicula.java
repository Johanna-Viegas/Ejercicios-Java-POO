/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class Pelicula {
    
    private String titulo;
    private String director;
    private Integer edadMin;
    private Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer edadMin, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.edadMin = edadMin;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getEdadMin() {
        return edadMin;
    }

    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula " + titulo + "\n Director " + director + "\n Edad requerida " + edadMin + "\n Duracion " + duracion;
    }
    
    
}
