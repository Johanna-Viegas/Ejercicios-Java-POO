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
public class Yate extends Barco{
    
    private Integer camarotes;
    private Integer potenciaCV;

    public Yate() {
    }

    public Yate(Integer camarotes, Integer potenciaCV, String matricula, Integer eslora, Date fabricacion, String ocupado) {
        super(matricula, eslora, fabricacion, ocupado);
        this.camarotes = camarotes;
        this.potenciaCV = potenciaCV;
    }

    public Yate(int i, String fG186DE, int i0, Date date, String desocupado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
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
                + "\n Potencia: " + potenciaCV
                + "\n Camarotes: " + camarotes
                + "\n Disponibilidad: " + ocupado;
    }
}
