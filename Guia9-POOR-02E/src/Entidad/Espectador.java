/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import Enum.Nombre;

/**
 *
 * @author Windows 10
 */
public class Espectador {
    
    private Nombre nombre;
    private Integer edad;
    private Integer efectivoDisp;

    public Espectador() {
    }

    public Espectador(Nombre nombre, Integer edad, Integer efectivoDisp) {
        this.nombre = nombre;
        this.edad = edad;
        this.efectivoDisp = efectivoDisp;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getEfectivoDisp() {
        return efectivoDisp;
    }

    public void setEfectivoDisp(Integer efectivoDisp) {
        this.efectivoDisp = efectivoDisp;
    }

    @Override
    public String toString() {
        return "Nombre " + nombre + "\n -Edad " + edad + "\n -Efectivo " + efectivoDisp;
    }
    
    
}
