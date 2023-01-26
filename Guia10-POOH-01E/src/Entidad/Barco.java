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
public class Barco {
    
    protected String matricula;
    protected Integer eslora;
    protected Date fabricacion;
    protected String ocupado;

    public Barco() {
    }

    public Barco(String matricula, Integer eslora, Date fabricacion, String ocupado) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.fabricacion = fabricacion;
        this.ocupado = ocupado;
    }

    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula 
                + "\n Eslora: " + eslora
                + "\n Fabricacion: " + fabricacion
                + "\n Disponibilidad: " + ocupado;
    }
    
    
}
