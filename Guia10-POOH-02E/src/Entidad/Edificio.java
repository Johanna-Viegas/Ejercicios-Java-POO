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
 public abstract class Edificio {
    protected Integer alto;
    protected Integer ancho;
    protected Integer largo;

    public Edificio() {
    }

    public Edificio(Integer alto, Integer ancho, Integer largo) {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }

    public Integer getAlto() {
        return alto;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public Integer getAncho() {
        return ancho;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    
}
