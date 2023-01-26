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
public class Persona {
    
    protected String nombreApellido;
    protected Integer dni;
    protected String ECivil;

    public Persona() {
    }

    public Persona(String nombreApellido, Integer dni, String ECivil) {
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.ECivil = ECivil;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getECivil() {
        return ECivil;
    }

    public void setECivil(String ECivil) {
        this.ECivil = ECivil;
    }
    
    
}
