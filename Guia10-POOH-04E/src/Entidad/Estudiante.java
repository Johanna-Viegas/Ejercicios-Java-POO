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
public class Estudiante extends Persona{
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombreApellido, Integer dni, String ECivil) {
        super(nombreApellido, dni, ECivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
