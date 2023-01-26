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
public class EdificioDeOficinas extends Edificio{
    
    private Integer nOficinas;
    private Integer personasPOficina;
    private Integer nPisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer nOficinas, Integer personasPOficina, Integer nPisos, Integer alto, Integer ancho, Integer largo) {
        super(alto, ancho, largo);
        this.nOficinas = nOficinas;
        this.personasPOficina = personasPOficina;
        this.nPisos = nPisos;
    }

    public Integer getnOficinas() {
        return nOficinas;
    }

    public void setnOficinas(Integer nOficinas) {
        this.nOficinas = nOficinas;
    }

    public Integer getPersonasPOficina() {
        return personasPOficina;
    }

    public void setPersonasPOficina(Integer personasPOficina) {
        this.personasPOficina = personasPOficina;
    }

    public Integer getnPisos() {
        return nPisos;
    }

    public void setnPisos(Integer nPisos) {
        this.nPisos = nPisos;
    }

    @Override
    public Integer getAlto() {
        return alto;
    }

    @Override
    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    @Override
    public Integer getAncho() {
        return ancho;
    }

    @Override
    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    @Override
    public Integer getLargo() {
        return largo;
    }

    @Override
    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    
}
