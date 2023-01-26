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
public class PersonalDeServicio extends Empleado{
    private String seccion;

    public PersonalDeServicio() {
    }

    public PersonalDeServicio(String seccion, Date incorporacion, Integer nDespacho, String nombreApellido, Integer dni, String ECivil) {
        super(incorporacion, nDespacho, nombreApellido, dni, ECivil);
        this.seccion = seccion;
    }

   

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    
}
