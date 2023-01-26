/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author Windows 10
 */
public class Alquiler {
    private String nombre;
    private long dni;
    private Date fechaAlq;
    private Date fechaDev;
    private Integer Posicion;
    private int pos;

    public Alquiler() {
    }

    public Alquiler(String nombre, long dni, Date fechaAlq, Date fechaDev, Integer Posicion, int pos) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlq = fechaAlq;
        this.fechaDev = fechaDev;
        this.Posicion = Posicion;
        this.pos = pos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Date getFechaAlq() {
        return fechaAlq;
    }

    public void setFechaAlq(Date fechaAlq) {
        this.fechaAlq = fechaAlq;
    }

    public Date getFechaDev() {
        return fechaDev;
    }

    public void setFechaDev(Date fechaDev) {
        this.fechaDev = fechaDev;
    }

    public Integer getPosicion() {
        return Posicion;
    }

    public void setPosicion(Integer Posicion) {
        this.Posicion = Posicion;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    
}
