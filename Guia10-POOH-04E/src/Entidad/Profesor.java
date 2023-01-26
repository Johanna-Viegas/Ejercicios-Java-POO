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
public class Profesor extends Empleado{
    private String depto;

    public Profesor() {
    }

    public Profesor(String depto, Date incorporacion, Integer nDespacho, String nombreApellido, Integer dni, String ECivil) {
        super(incorporacion, nDespacho, nombreApellido, dni, ECivil);
        this.depto = depto;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    
    
    
}
