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
public class Polideportivo extends Edificio{
    
    private boolean techo;
    private String nombre;

    public Polideportivo() {
    }

    public Polideportivo(boolean techo, String nombre, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.techo = techo;
        this.nombre = nombre;
    }

    public boolean isTecho() {
        return techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public Integer getAlto() {
        return alto;
    }

    @Override
    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    @Override
    public Integer getAncho() {
        return ancho;
    }

    @Override
    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    @Override
    public Integer getLargo() {
        return largo;
    }

    @Override
    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    
}
