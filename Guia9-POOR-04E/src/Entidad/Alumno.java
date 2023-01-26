/*
clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
 */
package Entidad;

/**
 *
 * @author Windows 10
 */
public class Alumno {
    
    private String nombreC;
    private Integer dni;
    private Integer qVotos;
    private String[] votosR;

    public Alumno() {
    }

    public Alumno(String nombreC, Integer dni) {
        this.nombreC = nombreC;
        this.dni = dni;

    }

    public Alumno(String nombreC, Integer dni, Integer qVotos, String[] votosR) {
        this.nombreC = nombreC;
        this.dni = dni;
        this.qVotos = qVotos;
        this.votosR = votosR;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getqVotos() {
        return qVotos;
    }

    public void setqVotos(Integer qVotos) {
        this.qVotos = qVotos;
    }

    public String[] getVotosR() {
        return votosR;
    }

    public void setVotosR(String[] votosR) {
        this.votosR = votosR;
    }
    
    
    
    
}
