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
public class Empleado extends Persona{
    protected Date incorporacion;
    protected Integer nDespacho;

    public Empleado() {
    }

    public Empleado(Date incorporacion, Integer nDespacho, String nombreApellido, Integer dni, String ECivil) {
        super(nombreApellido, dni, ECivil);
        this.incorporacion = incorporacion;
        this.nDespacho = nDespacho;
    }

    public Date getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(Date incorporacion) {
        this.incorporacion = incorporacion;
    }

    public Integer getnDespacho() {
        return nDespacho;
    }

    public void setnDespacho(Integer nDespacho) {
        this.nDespacho = nDespacho;
    }
    
    
}
