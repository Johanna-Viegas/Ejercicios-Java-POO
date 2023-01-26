/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Windows 10
 */
public class Voto {
    
    private Alumno alumnoVota;
    private ArrayList<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumnoVota, ArrayList<Alumno> alumnosVotados) {
        this.alumnoVota = alumnoVota;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumnoVota() {
        return alumnoVota;
    }

    public void setAlumnoVota(Alumno alumnoVota) {
        this.alumnoVota = alumnoVota;
    }

    public ArrayList<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(ArrayList<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }
    
    
}
