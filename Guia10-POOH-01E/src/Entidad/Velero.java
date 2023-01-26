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
public class Velero extends Barco{
    
    private Integer mastiles;

    public Velero() {
    }

    public Velero(Integer mastiles, String matricula, Integer eslora, Date fabricacion, String ocupado) {
        super(matricula, eslora, fabricacion, ocupado);
        this.mastiles = mastiles;
    }

    

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public Integer getEslora() {
        return eslora;
    }

    @Override
    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    @Override
    public Date getFabricacion() {
        return fabricacion;
    }

    @Override
    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    @Override
    public String getOcupado() {
        return super.getOcupado(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setOcupado(String ocupado) {
        super.setOcupado(ocupado); //To change body of generated methods, choose Tools | Templates.
    }
    
        @Override
    public String toString() {
        return "Matricula: " + matricula 
                + "\n Eslora: " + eslora
                + "\n Fabricacion: " + fabricacion
                + "\n Mastiles:" + mastiles
                + "\n Disponibilidad: " + ocupado;
                
    }

}
